package br.com.analitics.repository;

import org.springframework.stereotype.Repository;

import br.com.analitics.model.Campeao;

@Repository
public class CampeaoRepository {
	
	public Campeao findByIdRito(Integer idRito) {
		Campeao campeao = null;
		
		try {
			final StringBuffer jpql = new StringBuffer();
			jpql.append("SELECT campeao ");
			jpql.append(" FROM Campeao campeao");
			jpql.append(" WHERE campeao.idRito = :idRito");
			
			
			System.out.println("Deu Tudo Certo ao buscar item por idRito");
		} catch(Exception e) {
			System.out.println("Deu algum erro ao buscar item por idRito");
		}
		
		return campeao;
	}
}
