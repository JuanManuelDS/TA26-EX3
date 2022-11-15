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

import main.dto.Cajero;
import main.services.CajeroService;

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroService cajeroService;
	
	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros(){
		return cajeroService.listarCajeros();
	}
	
	@GetMapping("/cajeros/{codigo}")
	public Cajero buscarCajero(@PathVariable(name="codigo")Long codigo) {
		return cajeroService.buscarCajero(codigo);
	}
	
	@PostMapping("/cajeros")
	public Cajero guardarCajero(@RequestBody Cajero cajero) {
		return cajeroService.guardarCajero(cajero);
	}
	
	@PutMapping("/cajeros/{codigo}")
	public Cajero actualizarCajero(@PathVariable(name="codigo") Long codigo, @RequestBody Cajero cajero) {
		
		Cajero cajeroSeleccionado = cajeroService.buscarCajero(codigo);
		
		cajeroSeleccionado.setNomApels(cajero.getNomApels());
		
		return cajeroService.actualizarCajero(cajeroSeleccionado);
	}
	
	@DeleteMapping("/cajeros/{codigo}")
	public void eliminarCajero(@PathVariable(name="codigo")Long codigo) {
		cajeroService.eliminarCajero(codigo);
	}
}
