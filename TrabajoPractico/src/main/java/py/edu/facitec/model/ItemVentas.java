package py.edu.facitec.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ItemVentas extends General {
	private Integer cantidad;
	@ManyToOne
	private Venta venta;
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	
}
