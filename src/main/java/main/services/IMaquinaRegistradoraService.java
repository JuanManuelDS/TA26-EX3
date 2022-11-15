package main.services;

import java.util.List;

import main.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {

	public List<MaquinaRegistradora> listarMaquinas();
	
	public MaquinaRegistradora buscarMaquina(Long codigo);
	
	public MaquinaRegistradora guardarMaquina(MaquinaRegistradora maquinaRegistradora);
	
	public MaquinaRegistradora actualizarMaquina(MaquinaRegistradora maquinaRegistradora);
	
	public void eliminarMaquina(Long codigo);
}
