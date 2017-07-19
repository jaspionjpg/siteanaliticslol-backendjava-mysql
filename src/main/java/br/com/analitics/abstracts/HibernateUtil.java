package br.com.analitics.abstracts;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	private static EntityManager entityManager;
	public static EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("analitics");
        if (entityManager == null) {
             entityManager = factory.createEntityManager();
        }
        return entityManager;
	}
}
