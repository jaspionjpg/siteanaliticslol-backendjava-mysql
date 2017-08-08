package br.com.analitics.utils.database;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;

import org.springframework.stereotype.Component;

@Component
public class DAO<T> {
	
	private EntityManager entityManager;
	
	public DAO() {
	}
	
	public T findById(final Long id) throws Exception {
		return getSession().find(this.getGenericArgumentClass(), id);
	}
	
	public T save(T entity) {
		try {
			getSession().getTransaction().begin();
			getSession().persist(entity);
			getSession().getTransaction().commit();
			return entity;
		} catch (Exception e) {
			return null;
		}
	}
	
	public void update(T entity) {
		try {
			getSession().getTransaction().begin();
			getSession().merge(entity);
			getSession().getTransaction().commit();
		} catch (Exception e) {
		}
	}
	
	public void delete(T entity) {
		try {
			getSession().getTransaction().begin();
			getSession().remove(entity);
			getSession().getTransaction().commit();
		} catch (Exception e) {
		}
	}
	
	@SuppressWarnings("unchecked")
	public Class<T> getGenericArgumentClass() {
		return (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void flush() {
		getSession().setFlushMode(FlushModeType.COMMIT);
		getSession().flush();
	}
	
	public EntityManager getSession() {
		if(entityManager == null || !entityManager.isOpen())
			entityManager = HibernateUtil.getEntityManager();
		return entityManager;
	}
}