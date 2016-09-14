package com.coursera.semanaquatro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coursera.semanaquatro.ProdutoComTamanho;

public class ProdutoComTamanhoTest {

	@Test
	public void testProdutosIguaisComTamanhsDistintos() {
		
		ProdutoComTamanho produtoX = new ProdutoComTamanho("Havaianas", 100, 39.9, 41);
		ProdutoComTamanho produtoY = new ProdutoComTamanho("Havaianas", 100, 39.9, 37);
		
		assertEquals(true, !produtoX.equals(produtoY));
	}

}
