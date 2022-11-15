package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.ICajeroDAO;
import main.dto.Cajero;

@Service
public class CajeroService implements ICajeroService {

	@Autowired
	ICajeroDAO iCajeroDAO;
	
	@Override
	public List<Cajero> listarCajeros() {
		// TODO Auto-generated method stub
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero buscarCajero(Long codigo) {
		// TODO Auto-generated method stub
		return iCajeroDAO.findById(codigo).get();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(Long codigo) {
		// TODO Auto-generated method stub
		iCajeroDAO.deleteById(codigo);
	}

}
