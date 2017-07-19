package br.com.analitics.repository;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.analitics.abstracts.DAO;
import br.com.analitics.model.Campeao;

@Repository
public class CampeaoRepository extends DAO<Campeao> {
	
	public Campeao findByIdRito(Integer idRito) {
		Campeao campeao = null;
		
		try {
			final StringBuffer jpql = new StringBuffer();
			jpql.append("SELECT campeao ");
			jpql.append(" FROM Campeao campeao");
			jpql.append(" WHERE campeao.idRito = :idRito");
			
			final TypedQuery<Campeao> query =  this.getSession().createQuery(jpql.toString(), Campeao.class);
			query.setParameter("idRito", idRito);
			
			campeao = (Campeao) query.getSingleResult();
			
			System.out.println("Deu Tudo Certo ao buscar item por idRito");
		} catch(Exception e) {
			System.out.println("Deu algum erro ao buscar item por idRito");
		}
		
		return campeao;
	}
}
