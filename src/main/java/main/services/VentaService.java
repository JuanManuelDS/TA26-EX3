package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IVentaDAO;
import main.dto.Venta;

@Service
public class VentaService implements IVentaService {

	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarVentas() {
		// TODO Auto-generated method stub
		return iVentaDAO.findAll();
	}

	@Override
	public Venta buscarVenta(Long id) {
		// TODO Auto-generated method stub
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(Long id) {
		// TODO Auto-generated method stub
		iVentaDAO.deleteById(id);
	}
}
