package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaPedidosBean {

	private List<Integer> pedidosFiltrados;

	
	public PesquisaPedidosBean(){
		pedidosFiltrados = new ArrayList<>();
		for (int i = 0; i < 500; i++) {
			pedidosFiltrados.add(i);
			System.out.println(pedidosFiltrados);
		}
	}
	
	public List<Integer> getPedidosFiltrados(){
		return pedidosFiltrados;
	}
}
