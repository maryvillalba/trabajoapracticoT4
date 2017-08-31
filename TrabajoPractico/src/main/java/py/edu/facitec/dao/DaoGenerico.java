package py.edu.facitec.dao;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class DaoGenerico<T> {
	private Class<T> entityClass;

	public DaoGenerico(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract EntityManager getEntityManager();

	public void insertar(T entity) {
		getEntityManager().persist(entity);
	}

	public void actualizar(T entity) {
		getEntityManager().merge(entity);
	}

	public T buscar(Object id) {

		return getEntityManager().find(entityClass, id);

	}

	public void guardar(T entity) {

		Object id = getEntityManager().getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(entity);

		System.out.println("El id en guardar es: " + id);
		if (id != null) {
			if (buscar(id) == null) {
				getEntityManager().persist(entity);
			} else {
				getEntityManager().merge(entity);
			}
		} else {
			getEntityManager().persist(entity);
		}
	}

	public List<T> getLista() {
		return getEntityManager().createQuery("from " + entityClass.getSimpleName(), entityClass).getResultList();

	}

	public void eliminar(T entity) {

		getEntityManager().remove(getEntityManager().contains(entity) ? entity : getEntityManager().merge(entity)

		);

	}

}
