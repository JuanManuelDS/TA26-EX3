package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IProductoDAO;
import main.dto.Producto;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	IProductoDAO iProductoDAO;

	@Override
	public List<Producto> listarProductos() {
		// TODO Auto-generated method stub
		return iProductoDAO.findAll();
	}

	@Override
	public Producto buscarProducto(Long codigo) {
		// TODO Auto-generated method stub
		return iProductoDAO.findById(codigo).get();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return iProductoDAO.save(producto);
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return iProductoDAO.save(producto);
	}

	@Override
	public void eliminarProducto(Long codigo) {
		// TODO Auto-generated method stub
		iProductoDAO.deleteById(codigo);
	}
	
	
}
