package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Long> {

}
