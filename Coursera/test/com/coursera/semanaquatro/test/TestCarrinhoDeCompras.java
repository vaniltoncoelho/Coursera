package com.coursera.semanaquatro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.coursera.semanaquatro.CarrinhoDeCompras;
import com.coursera.semanaquatro.Produto;
import com.coursera.semanaquatro.ProdutoComTamanho;

public class TestCarrinhoDeCompras {
	
	private CarrinhoDeCompras carrinho;
	private Produto geladeira;
	private ProdutoComTamanho chinelo;

	
	@Before
	public void inicializaCarrinhoParaTeste() {
		
		carrinho = new CarrinhoDeCompras();
		
		geladeira = new Produto("Geladeira", 1, 1900.50);
		chinelo = new ProdutoComTamanho("Chinelo", 2, 49.90, 41);
		
	}

	@Test
	public void testAdicionaProduto() {
		carrinho.adicionaProduto(geladeira, 5);
		assertEquals(5, carrinho.getQuantidadeProdutos());

	}

	@Test
	public void testRemoveProduto() {
		carrinho.adicionaProduto(geladeira, 5);
		carrinho.removeProduto(geladeira, 3);
		assertEquals(2, carrinho.getQuantidadeProdutos());
	}
	
	@Test
	public void testValorTotalCarrinho() {
		carrinho.adicionaProduto(geladeira, 5);
		carrinho.adicionaProduto(chinelo, 51);
		assertEquals(12047.4, carrinho.getValorTotal(), 0);
	}

}
