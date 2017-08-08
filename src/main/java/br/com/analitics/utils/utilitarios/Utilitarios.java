package br.com.analitics.utils.utilitarios;

import javax.persistence.EntityManager;

import org.hibernate.stat.Statistics;

import br.com.analitics.utils.database.HibernateUtil;

public final class Utilitarios {
	
	private Utilitarios() {
		throw new AssertionError();
	}
	
	public static void sysoStatistics(final StringBuffer jpql, EntityManager session) {
		Statistics statistica = HibernateUtil.getStatistics(session);
		System.out.println("Entidades carregadas: "+statistica.getEntityLoadCount());
		System.out.println("Execuções: "+statistica.getQueryExecutionCount());
		System.out.println("Tempo maximo de execução: "+statistica.getQueryExecutionMaxTime());
		System.out.println("///////////////////////////////////////////////////////////////");
		System.out.println("Tempo médio: "+statistica.getQueryStatistics(jpql.toString()).getExecutionAvgTime());
		System.out.println("Tempo minimo: "+statistica.getQueryStatistics(jpql.toString()).getExecutionMinTime());
		System.out.println("Tempo maximo: "+statistica.getQueryStatistics(jpql.toString()).getExecutionMaxTime());
		System.out.println("Linhas: "+statistica.getQueryStatistics(jpql.toString()).getExecutionRowCount());
		for(String entidade : statistica.getEntityNames()){
			System.out.println("Entidade: "+ entidade);
		}
		System.out.println("///////////////////////////////////////////////////////////////");
	}
}
