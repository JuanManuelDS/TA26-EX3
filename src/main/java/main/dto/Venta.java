package main.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cajero")
	private Cajero cajero;
	
	@ManyToOne
	@JoinColumn(name="producto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="maquina")
	private MaquinaRegistradora maquinaRegistradora;
	
	public Venta() {
		// TODO Auto-generated constructor stub
	}

	public Venta(Long id, Cajero cajero, Producto producto, MaquinaRegistradora maquinaRegistradora) {
		this.id = id;
		this.cajero = cajero;
		this.producto = producto;
		this.maquinaRegistradora = maquinaRegistradora;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public MaquinaRegistradora getMaquinaRegistradora() {
		return maquinaRegistradora;
	}

	public void setMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {
		this.maquinaRegistradora = maquinaRegistradora;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", producto=" + producto + ", maquinaRegistradora="
				+ maquinaRegistradora + "]";
	}
	
	
}
