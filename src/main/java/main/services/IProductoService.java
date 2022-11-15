package main.services;

import java.util.List;

import main.dto.Producto;

public interface IProductoService {

	public List<Producto> listarProductos();
	
	public Producto buscarProducto(Long codigo);
	
	public Producto guardarProducto(Producto producto);
	
	public Producto actualizarProducto(Producto producto);
	
	public void eliminarProducto(Long codigo);
	
}
