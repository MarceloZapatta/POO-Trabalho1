package fatec.poo.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class ItemPedido {
    private final int qtdeVend;
    private double subTotal;
    private Pedido pedido;
    private final Produto produto;
    
    public ItemPedido(Produto produto, int qtdeVend) {
        this.produto = produto;
        this.qtdeVend = qtdeVend;
    }

    public int getQtdeVend() {
        return qtdeVend;
    }
    
    public double getSubTotal() {
        return subTotal;
    }
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }
}