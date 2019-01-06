package kiosco.model;

import javax.persistence.*;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true)
	private String nombre;
	
	private int precio;	
	private int stock;
	
	public Producto(String nombre, int precio, int stock) {
		this.nombre = nombre;
		this.setPrecio(precio);
		this.setStock(stock);
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
}