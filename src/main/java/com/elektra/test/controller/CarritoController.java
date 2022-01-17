package com.elektra.test.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elektra.test.beans.DummyProductos;
import com.elektra.test.beans.Producto;
import com.elektra.test.service.CarritoService;


@RestController
@RequestMapping("/superapp")
public class CarritoController {
	@Autowired
	DummyProductos dummy;
	
	@Autowired
	CarritoService service;
	
	@GetMapping("/productos")
	public List<Producto> getProductos() {
		return dummy.getListaProd();
	}
	
	@PostMapping("/compra")
	public Object addProductoLista(@PathParam(value = "idCliente") int idCliente, @PathParam(value = "idProducto") int idProducto) {
		service.addProducto(idCliente, idProducto);
		return HttpStatus.ACCEPTED;
	}
}
