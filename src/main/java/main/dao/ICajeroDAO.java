package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Cajero;

public interface ICajeroDAO extends JpaRepository<Cajero, Long>{

}
