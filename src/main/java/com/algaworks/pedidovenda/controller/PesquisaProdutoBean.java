package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaProdutoBean {

	private List<Integer> produtosFiltrados;
	
	public PesquisaProdutoBean(){
		produtosFiltrados = new ArrayList<>();
		for (int i = 0; i < 500; i++) {
			produtosFiltrados.add(i);
			System.out.println("A buceta do get produtos filtrados1" + produtosFiltrados);
		}
	}
	
	public List<Integer> getProdutosFiltrados(){
		System.out.println("A buceta do get produtos filtrados 222 " + produtosFiltrados);
		return produtosFiltrados;
	}
}
