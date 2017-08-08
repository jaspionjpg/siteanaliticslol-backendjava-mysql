package br.com.analitics.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.analitics.model.EstatisticaJogador;
import br.com.analitics.utils.database.DAO;
import br.com.analitics.vo.jogador.JogadorResumoCampeaoVO;
import br.com.analitics.vo.jogador.JogadorResumoVO;

@Repository
public class EstatisticaJogadorRepository extends DAO<EstatisticaJogador> {

	public List<JogadorResumoCampeaoVO> findJogadoresDestaqueByIdRito(int idRito) {
		final StringBuffer jpql = new StringBuffer();
		jpql.append("SELECT distinct");
		jpql.append(" new br.com.analitics.vo.jogador.JogadorResumoCampeaoVO");
		jpql.append(" (");
		jpql.append(" estatisticaJogador.jogador.id,");
		jpql.append(" estatisticaJogador.jogador.nick,");
		jpql.append(" estatisticaJogador.jogador.slug,");
		jpql.append(" AVG((estatisticaJogador.abates + estatisticaJogador.assistencias) / estatisticaJogador.mortes),");
		jpql.append(" AVG(estatisticaJogador.abates),");
		jpql.append(" AVG(estatisticaJogador.mortes),");
		jpql.append(" AVG(estatisticaJogador.assistencias),");
		jpql.append(" COUNT(estatisticaJogador.id),");
		jpql.append(" (SELECT COUNT(estatistica.id) FROM EstatisticaJogador estatistica WHERE estatistica.campeao.idRito = :idRito AND estatistica.jogador.id = estatisticaJogador.jogador.id AND estatistica.vencedor = :true)");
		jpql.append(" )");
		jpql.append(" FROM EstatisticaJogador estatisticaJogador");
		jpql.append(" WHERE estatisticaJogador.campeao.idRito = :idRito");
		jpql.append(" GROUP BY estatisticaJogador.jogador");
		jpql.append(" ORDER BY 9 DESC, 4 DESC ");
		
		final TypedQuery<JogadorResumoCampeaoVO> query =  this.getSession().createQuery(jpql.toString(), JogadorResumoCampeaoVO.class);
		query.setParameter("idRito", idRito);
		query.setParameter("true", Boolean.TRUE);
		
		return (List<JogadorResumoCampeaoVO>) query.getResultList();
	}

	public List<JogadorResumoVO> searchJogadores(Integer ordenacao) {
		final StringBuffer jpql = new StringBuffer();
		jpql.append("SELECT distinct");
		jpql.append(" new br.com.analitics.vo.jogador.JogadorResumoVO");
		jpql.append(" (");
		jpql.append(" estatisticaJogador.jogador.id,");
		jpql.append(" estatisticaJogador.jogador.nick,");
		jpql.append(" estatisticaJogador.jogador.slug,");
		jpql.append(" estatisticaJogador.jogador.funcao,");
		jpql.append(" AVG((estatisticaJogador.abates + estatisticaJogador.assistencias) / estatisticaJogador.mortes),");
		jpql.append(" AVG(estatisticaJogador.abates),");
		jpql.append(" AVG(estatisticaJogador.mortes),");
		jpql.append(" AVG(estatisticaJogador.assistencias),");
		jpql.append(" AVG(estatisticaJogador.goldGanho),");
		jpql.append(" AVG(estatisticaJogador.farme),");
		jpql.append(" AVG(estatisticaJogador.totalDano),");
		jpql.append(" AVG(estatisticaJogador.wardsColocadas),");
		jpql.append(" SUM(estatisticaJogador.doubleKills),");
		jpql.append(" SUM(estatisticaJogador.tripleKills),");
		jpql.append(" SUM(estatisticaJogador.quadraKills),");
		jpql.append(" SUM(estatisticaJogador.pentaKills),");
		jpql.append(" AVG(estatisticaJogador.tempoPartida),");
		jpql.append(" COUNT(estatisticaJogador.id),");
		jpql.append(" (SELECT COUNT(estatistica.id) FROM EstatisticaJogador estatistica WHERE estatistica.jogador.id = estatisticaJogador.jogador.id AND estatistica.vencedor = :true)");
		jpql.append(" )");
		jpql.append(" FROM EstatisticaJogador estatisticaJogador");
		jpql.append(" GROUP BY estatisticaJogador.jogador");
		jpql.append(" ORDER BY :ordenacao DESC");
		
		final TypedQuery<JogadorResumoVO> query =  this.getSession().createQuery(jpql.toString(), JogadorResumoVO.class);
		query.setParameter("true", Boolean.TRUE);
		query.setParameter("ordenacao", ordenacao);
		
		return (List<JogadorResumoVO>) query.getResultList();
	}
}
