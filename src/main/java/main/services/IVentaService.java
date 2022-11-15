package main.services;

import java.util.List;

import main.dto.Venta;

public interface IVentaService {
	
	public List<Venta> listarVentas();
	
	public Venta buscarVenta(Long id);
	
	public Venta guardarVenta(Venta venta);
	
	public Venta actualizarVenta(Venta venta);
	
	public void eliminarVenta(Long id);
}
