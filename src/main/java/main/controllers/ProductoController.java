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

import main.dto.Producto;
import main.services.IProductoService;
import main.services.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductoService productoService;
	
	@GetMapping("/productos")
	public List<Producto> listarProductos(){
		return productoService.listarProductos();
	}
	
	@GetMapping("/productos/{codigo}")
	public Producto buscarProducto(@PathVariable(name="codigo")Long codigo) {
		return productoService.buscarProducto(codigo);
	}
	
	@PostMapping("/productos")
	public Producto guardarProducto(@RequestBody Producto producto) {
		return productoService.guardarProducto(producto);
	}
	
	@PutMapping("/productos/{codigo}")
	public Producto actualizarProducto(@PathVariable(name="codigo") Long codigo, @RequestBody Producto producto) {
		
		Producto productoSeleccionado = productoService.buscarProducto(codigo);
		
		productoSeleccionado.setNombre(producto.getNombre());
		productoSeleccionado.setPrecio(producto.getPrecio());
		
		return productoService.actualizarProducto(productoSeleccionado);
	}
	
	@DeleteMapping("/productos/{codigo}")
	public void eliminarProducto(@PathVariable(name="codigo")Long codigo) {
		productoService.eliminarProducto(codigo);
	}
}
