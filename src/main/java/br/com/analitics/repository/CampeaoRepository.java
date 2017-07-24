package br.com.analitics.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.analitics.model.Campeao;
import br.com.analitics.utils.DAO;
import br.com.analitics.vo.CampeaoListaVO;

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
	
	public List<CampeaoListaVO> findAllLista() {
		List<CampeaoListaVO> campeao = null;
		try {
			final StringBuffer jpql = new StringBuffer();
			jpql.append("SELECT distinct");
			jpql.append(" new br.com.analitics.vo.CampeaoListaVO");
			jpql.append(" (");
			jpql.append("	campeao.id,");
			jpql.append("	campeao.nome,");
			jpql.append(" 	campeao.chave");
			jpql.append(" ) ");
			jpql.append(" FROM Campeao campeao");
			
			final TypedQuery<CampeaoListaVO> query =  this.getSession().createQuery(jpql.toString(), CampeaoListaVO.class);
			
			campeao = (List<CampeaoListaVO>) query.getResultList();
			
			System.out.println("Deu Tudo Certo ao buscar item por idRito");
		} catch(Exception e) {
			System.out.println("Deu algum erro ao buscar item por idRito");
		}
		
		return campeao;
	}
	
	public List<CampeaoListaVO> findResumoById() {
		List<CampeaoListaVO> campeao = null;
		try {
			final StringBuffer jpql = new StringBuffer();
			jpql.append("SELECT distinct");
			jpql.append(" new br.com.analitics.vo.CampeaoListaVO");
			jpql.append(" (");
			jpql.append("	campeao.id,");
			jpql.append("	campeao.nome,");
			jpql.append(" 	campeao.chave");
			jpql.append(" ) ");
			jpql.append(" FROM Campeao campeao");
			
			final TypedQuery<CampeaoListaVO> query =  this.getSession().createQuery(jpql.toString(), CampeaoListaVO.class);
			
			campeao = (List<CampeaoListaVO>) query.getResultList();
			
			System.out.println("Deu Tudo Certo ao buscar item por idRito");
		} catch(Exception e) {
			System.out.println("Deu algum erro ao buscar item por idRito");
		}
		
		return campeao;
	}
}
