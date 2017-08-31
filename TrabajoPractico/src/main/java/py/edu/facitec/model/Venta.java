package py.edu.facitec.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Venta extends General {
	
	private BigDecimal monto;
	private String factura;
	@OneToMany(mappedBy ="venta")
	private List<ItemVentas> itemVentas;
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getFactura() {
		return factura;
	}
	public void setFactura(String factura) {
		this.factura = factura;
	}
	public List<ItemVentas> getItemVentas() {
		return itemVentas;
	}
	public void setItemVentas(List<ItemVentas> itemVentas) {
		this.itemVentas = itemVentas;
	}

	
}
