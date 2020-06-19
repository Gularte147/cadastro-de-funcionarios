package com.gabrielduarte.cadastrodeproduto.business.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name ="produto")
public class ProdutoBean {
	
	private String nome;
	private String preco;
	private Float categoria;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public Float getCategoria() {
		return categoria;
	}
	public void setCategoria(Float categoria) {
		this.categoria = categoria;
	}
	

}
