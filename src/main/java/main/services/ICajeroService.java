package main.services;

import java.util.List;

import main.dto.Cajero;

public interface ICajeroService {

	public List<Cajero> listarCajeros();
	
	public Cajero buscarCajero(Long codigo);
	
	public Cajero guardarCajero(Cajero cajero);
	
	public Cajero actualizarCajero(Cajero cajero);
	
	public void eliminarCajero(Long codigo);
}
