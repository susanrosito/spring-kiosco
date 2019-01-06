package kiosco.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Compra {

	@Id
	private int nroCompra;
	
	@Transient
	private List<Producto> listaProductos;
	
	private int total;
	
	public int getNroCompra() {
		return nroCompra;
	}
	public void setNroCompra(int nrocompra) {
		this.nroCompra = nrocompra;
	}
	
	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}
}