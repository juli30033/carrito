package com.elektra.test.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

@ManagedBean
public class DummyProductos {

	private List<Producto> listaProd;
	
	public DummyProductos() {
		listaProd=new ArrayList<>();
		Producto producto1=new Producto();
		producto1.setDescripcion("Producto1");
		producto1.setId(1);
		producto1.setNombre("Producto Uno");
		producto1.setPrecio(1.5);
		Producto producto2=new Producto();
		producto2.setDescripcion("Producto2");
		producto2.setId(2);
		producto2.setNombre("Producto Dos");
		producto2.setPrecio(40.00);
		Producto producto3=new Producto();
		producto3.setDescripcion("Producto3");
		producto3.setId(3);
		producto3.setNombre("Producto Tres");
		producto3.setPrecio(85.45);
		Producto producto4=new Producto();
		producto4.setDescripcion("Producto4");
		producto4.setId(4);
		producto4.setNombre("Producto Cuatro");
		producto4.setPrecio(100.99);
		Producto producto5=new Producto();
		producto5.setDescripcion("Producto5");
		producto5.setId(5);
		producto5.setNombre("Producto Cinco");
		producto5.setPrecio(423894.19);
		listaProd.add(producto1);
		listaProd.add(producto2);
		listaProd.add(producto3);
		listaProd.add(producto4);
		listaProd.add(producto5);
	}

	public List<Producto> getListaProd() {
		return listaProd;
	}

	public void setListaProd(List<Producto> listaProd) {
		this.listaProd = listaProd;
	}


}
