package main.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column
	private String nombre;
	
	@Column
	private int precio;
	
	@OneToMany( mappedBy = "producto", cascade = CascadeType.ALL)
	private List<Venta> ventas;

	public Producto(Long codigo, String nombre, int precio, List<Venta> ventas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.ventas = ventas;
	}
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Long getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", ventas=" + ventas + "]";
	}
	
	
}
