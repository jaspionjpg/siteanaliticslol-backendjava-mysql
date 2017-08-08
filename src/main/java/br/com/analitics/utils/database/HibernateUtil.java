package br.com.analitics.utils.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.stat.Statistics;

public class HibernateUtil {
	private static EntityManager entityManager;
	public static EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("analitics");
        if (entityManager == null) {
             entityManager = factory.createEntityManager();
        }
        return entityManager;
	}
	
	public static Statistics getStatistics(EntityManager em){
		return ((Session) em.getDelegate()).getSessionFactory().getStatistics();
	}
}
