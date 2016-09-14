package com.coursera.semanaquatro;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.RequestingUserName;

public class CarrinhoDeCompras {
	
    private Map<Produto, Integer> registroProdutos = new HashMap<Produto, Integer>(0);
    private double valorTotal;

    public void adicionaProduto(Produto produto, Integer quantidade) {
    	
    	//Quando produto já existe, a quantidade é incrementada com oque já existe na mesma posição do produto
    	if(registroProdutos.containsKey(produto)) {
        	registroProdutos.put(produto, registroProdutos.get(produto) + quantidade);
    	}
    	
    	registroProdutos.put(produto, quantidade);
    }
    
    public Integer removeProduto(Produto produto, Integer quantidade) {
    	
    	//produto deve existir no carrinho e quantidade solicitada para remoção deve ser menor que a quantidade no carrinho.
    	if(registroProdutos.containsKey(produto) && (quantidade < registroProdutos.get(produto))) {
        	registroProdutos.put(produto, registroProdutos.get(produto) - quantidade);
        	return quantidade;
    	}
    	
    	return 0;
    }
    
    public double getValorTotal() {
    	
    	for (Produto key : registroProdutos.keySet()) {
            //Capturamos o valor a partir da chave
            valorTotal += key.getPreco() * registroProdutos.get(key);
    	}
    	
    	return valorTotal;
    }
    
    public int getQuantidadeProdutos() {
    	if (registroProdutos != null && !registroProdutos.isEmpty()) {
    		
    		int quantidade = 0;
    		for (Produto key : registroProdutos.keySet()) {
                
                //Capturamos o valor a partir da chave
                quantidade += registroProdutos.get(key);
        	}
    		return quantidade;
    	} else {
    		return 0;
    	}
    }
    
}
