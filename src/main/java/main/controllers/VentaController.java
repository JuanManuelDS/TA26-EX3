package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Venta;
import main.services.VentaService;

@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaService ventaService;
	
	@GetMapping("/ventas")
	public List<Venta> listarVentas(){
		return ventaService.listarVentas();
	}
	
	@GetMapping("/ventas/{id}")
	public Venta buscarVenta(@PathVariable(name="id")Long id) {
		return ventaService.buscarVenta(id);
	}
	
	@PostMapping("/ventas")
	public Venta guardarVenta(@RequestBody Venta venta) {
		return ventaService.guardarVenta(venta);
	}
	
	@PutMapping("/ventas/{id}")
	public Venta actualizarVenta(@PathVariable(name="id")Long id, @RequestBody Venta venta) {
		
		Venta ventaSeleccionada = ventaService.buscarVenta(id);
		
		ventaSeleccionada.setCajero(venta.getCajero());
		ventaSeleccionada.setMaquinaRegistradora(venta.getMaquinaRegistradora());
		ventaSeleccionada.setProducto(venta.getProducto());
		
		return ventaService.actualizarVenta(ventaSeleccionada);
	}
	
	@DeleteMapping("/ventas/{id}")
	public void eliminarVenta(@PathVariable(name="id")Long id) {
		ventaService.eliminarVenta(id);
	}
}
