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
@Table(name="maquinas_registradoras")
public class MaquinaRegistradora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column
	private int piso;
	
	@OneToMany( mappedBy = "maquinaRegistradora", cascade = CascadeType.ALL)
	private List<Venta> ventas;
	
	public MaquinaRegistradora() {
		// TODO Auto-generated constructor stub
	}

	public MaquinaRegistradora(Long codigo, int piso, List<Venta> ventas) {
		super();
		this.codigo = codigo;
		this.piso = piso;
		this.ventas = ventas;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
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
		return "MaquinaRegistradora [codigo=" + codigo + ", piso=" + piso + ", ventas=" + ventas + "]";
	}
	
	
}
