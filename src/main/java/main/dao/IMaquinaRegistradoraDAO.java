package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraDAO extends JpaRepository<MaquinaRegistradora, Long>{

}
