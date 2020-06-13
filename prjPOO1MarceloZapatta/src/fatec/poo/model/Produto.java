package fatec.poo.model;

import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class Produto {
    private final int codigo;
    private final String descricao;
    private double preco;
    private int qtdeEstoque;

    public Produto(int codigo, String descricao, int qtdeEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtdeEstoque = qtdeEstoque;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }
    
    public void setQtdEstoque(int quantidade) {
        this.qtdeEstoque = quantidade;
    }
}
