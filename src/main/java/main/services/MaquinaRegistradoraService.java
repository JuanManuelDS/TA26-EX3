package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IMaquinaRegistradoraDAO;
import main.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraService implements IMaquinaRegistradoraService {

	@Autowired
	IMaquinaRegistradoraDAO iMaquinaRegistradoraDAO;

	@Override
	public List<MaquinaRegistradora> listarMaquinas() {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.findAll();
	}

	@Override
	public MaquinaRegistradora buscarMaquina(Long codigo) {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.findById(codigo).get();
	}

	@Override
	public MaquinaRegistradora guardarMaquina(MaquinaRegistradora maquinaRegistradora) {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public MaquinaRegistradora actualizarMaquina(MaquinaRegistradora maquinaRegistradora) {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public void eliminarMaquina(Long codigo) {
		// TODO Auto-generated method stub
		iMaquinaRegistradoraDAO.deleteById(codigo);
	}
}
