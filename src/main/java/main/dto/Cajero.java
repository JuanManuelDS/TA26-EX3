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
@Table(name="cajeros")
public class Cajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column
	private String nomApels;
	
	@OneToMany( mappedBy = "cajero", cascade = CascadeType.ALL)
	private List<Venta> ventas;

	public Cajero(Long codigo, String nomApels, List<Venta> ventas) {
		this.codigo = codigo;
		this.nomApels = nomApels;
		this.ventas = ventas;
	}
	
	public Cajero() {
		// TODO Auto-generated constructor stub
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
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
		return "Cajero [codigo=" + codigo + ", nomApels=" + nomApels + ", ventas=" + ventas + "]";
	}
	
	
}
