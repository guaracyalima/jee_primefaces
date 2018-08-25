package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroPedidoBean {

	private List<Integer> itens;
	
	public CadastroPedidoBean(){
		itens = new ArrayList<>();
		itens.add(1);
		System.out.println("numero de pedidos" + itens);
	}
	
	public List<Integer> getItens(){
		return itens;
	}
}
