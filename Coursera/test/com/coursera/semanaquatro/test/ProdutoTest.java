package com.coursera.semanaquatro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.coursera.semanaquatro.Produto;

public class ProdutoTest {

	@Test
	public void testProdutosIguais() {
		
		Produto produtoA = new Produto("Sombreiro", 10, 50);
		Produto produtoB = new Produto("Guarda Chuva", 10, 40);
		
		assertEquals(true, produtoA.equals(produtoB));
	}

}
