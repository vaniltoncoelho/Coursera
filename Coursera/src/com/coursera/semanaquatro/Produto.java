package com.coursera.semanaquatro;

public class Produto {
	
	private String nome;
	private int codigo;
	private double preco;
	
	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object o) {
		if ((o instanceof Produto) && ((Produto) o).getCodigo() == this.getCodigo())
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return this.getCodigo();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
