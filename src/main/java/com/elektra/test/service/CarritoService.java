package com.elektra.test.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elektra.test.beans.Carrito;
import com.elektra.test.beans.DummyProductos;
import com.elektra.test.beans.Producto;

@Service
public class CarritoService {

	private final HashMap<Integer, Carrito> mapa = new HashMap<Integer, Carrito>();
	
	@Autowired
	DummyProductos dummy;
	
	public void addProducto(int idCliente, int idProducto) {
		Carrito carritoAux;
		if(mapa.containsKey(idCliente)) {
			carritoAux = mapa.get(idCliente);
		}else {
			carritoAux=new Carrito();
			
			if(dummy.getListaProd().stream().filter(null)) 
			List<Producto> lista=new ArrayList<Producto>();
			lista.add(dummy.getListaProd().get(idProducto));
			carritoAux.setProductos(lista);
		}
		Integer cantidad=carritoAux.getProductos().get(idProducto).getCantidad();
		if((cantidad==null)||(cantidad==0)) {
			carritoAux.getProductos().get(idProducto).setCantidad(1);
		}else {
			cantidad++;
			carritoAux.getProductos().get(idProducto).setCantidad(cantidad);
		}
		mapa.put(idCliente, carritoAux);
		System.out.println(mapa.toString());
	}
}
