
package py.edu.facitec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.model.ItemVentas;

@Repository
public class ItemVentaDAO extends DaoGenerico<ItemVentas> {

	public ItemVentaDAO() {
		super(ItemVentas.class);
	}

	@PersistenceContext
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
}
