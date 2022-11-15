package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta,Long> {

}
