package br.com.analitics.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.analitics.model.Campeao;
import br.com.analitics.utils.database.DAO;
import br.com.analitics.utils.utilitarios.Utilitarios;
import br.com.analitics.vo.campeao.CampeaoListaVO;
import br.com.analitics.vo.campeao.CampeaoResumoVO;

@Repository
public class CampeaoRepository extends DAO<Campeao> {
	
	public Campeao findByIdRito(Integer idRito) {
		final StringBuffer jpql = new StringBuffer();
		jpql.append("SELECT campeao");
		jpql.append(" FROM Campeao campeao");
		jpql.append(" WHERE campeao.idRito = :idRito");
		
		final TypedQuery<Campeao> query =  this.getSession().createQuery(jpql.toString(), Campeao.class);
		query.setParameter("idRito", idRito);
		
		Utilitarios.sysoStatistics(jpql, getSession());
		
		return (Campeao) query.getSingleResult();
	}
	
	public CampeaoResumoVO findResumoByIdRito(int idRito) {
		final StringBuffer jpql = new StringBuffer();
		jpql.append("SELECT distinct");
		jpql.append(" new br.com.analitics.vo.campeao.CampeaoResumoVO");
		jpql.append(" (");
		jpql.append(" campeao.idRito,");
		jpql.append(" campeao.nome,");
		jpql.append(" campeao.titulo,");
		jpql.append(" (SELECT COUNT(estatisticaJogador.id) FROM EstatisticaJogador estatisticaJogador WHERE estatisticaJogador.campeao.idRito = :idRito AND estatisticaJogador.vencedor = :true),");
		jpql.append(" (SELECT AVG(estatisticaJogador.abates + estatisticaJogador.mortes + estatisticaJogador.assistencias) FROM EstatisticaJogador estatisticaJogador WHERE estatisticaJogador.campeao.idRito = :idRito),");
		jpql.append(" (SELECT COUNT(estatisticaJogador.id) FROM EstatisticaJogador estatisticaJogador WHERE estatisticaJogador.campeao.idRito = :idRito),");
		jpql.append(" campeao.chave");
		jpql.append(" )");
		jpql.append(" FROM Campeao campeao");
		jpql.append(" WHERE campeao.idRito = :idRito");
		
		final TypedQuery<CampeaoResumoVO> query =  this.getSession().createQuery(jpql.toString(), CampeaoResumoVO.class);
		query.setParameter("idRito", idRito);
		query.setParameter("true", Boolean.TRUE);
		
		return (CampeaoResumoVO) query.getSingleResult();
	}
	
	public List<CampeaoListaVO> findAllLista() {
		final StringBuffer jpql = new StringBuffer();
		jpql.append("SELECT distinct");
		jpql.append(" new br.com.analitics.vo.campeao.CampeaoListaVO");
		jpql.append(" (");
		jpql.append(" campeao.id,");
		jpql.append(" campeao.nome,");
		jpql.append(" campeao.chave");
		jpql.append(" )");
		jpql.append(" FROM Campeao campeao");
		
		final TypedQuery<CampeaoListaVO> query =  this.getSession().createQuery(jpql.toString(), CampeaoListaVO.class);
		
		return (List<CampeaoListaVO>) query.getResultList();
	}
}
