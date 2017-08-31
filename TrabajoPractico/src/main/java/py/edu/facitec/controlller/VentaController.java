package py.edu.facitec.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.dao.VentaDAO;
import py.edu.facitec.model.Venta;

@Transactional
@Controller
public class VentaController {
	@Autowired
	private VentaDAO ventaDAO;

	@RequestMapping("/ventas")
	public String save(Venta venta) {

		System.out.println("Registrando la venta: " + venta);
		ventaDAO.guardar(venta);

		return "/view/venta/ok";
	}

}
