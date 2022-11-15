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

import main.dto.MaquinaRegistradora;
import main.services.MaquinaRegistradoraService;

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {

	@Autowired
	MaquinaRegistradoraService maquinaService;
	
	@GetMapping("/maquinas")
	public List<MaquinaRegistradora> listarMaquinas(){
		return maquinaService.listarMaquinas();
	}
	
	@GetMapping("/maquinas/{codigo}")
	public MaquinaRegistradora buscarMaquina(@PathVariable(name="codigo")Long codigo) {
		return maquinaService.buscarMaquina(codigo);
	}
	
	@PostMapping("/maquinas")
	public MaquinaRegistradora guardarMaquina(@RequestBody MaquinaRegistradora maquinaRegistradora) {
		return maquinaService.guardarMaquina(maquinaRegistradora);
	}
	
	@PutMapping("/maquinas/{codigo}")
	public MaquinaRegistradora actualizarMaquina(@PathVariable(name="codigo") Long codigo, @RequestBody MaquinaRegistradora maquinaRegistradora) {
		
		MaquinaRegistradora maquinaSeleccionada = maquinaService.buscarMaquina(codigo);
		
		maquinaSeleccionada.setPiso(maquinaRegistradora.getPiso());
		
		return maquinaService.actualizarMaquina(maquinaSeleccionada);
	}
	
	@DeleteMapping("/maquinas/{codigo}")
	public void eliminarMaquina(@PathVariable(name="codigo") Long codigo) {
		maquinaService.eliminarMaquina(codigo);
	}
}
