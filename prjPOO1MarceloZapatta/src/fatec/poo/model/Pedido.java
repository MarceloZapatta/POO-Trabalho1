package fatec.poo.model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marcelo
 */
public class Pedido {

    private int numero;
    private double total;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itensPedido;
    private int numItemPed;
    private final DecimalFormat Formato;

    public Pedido(int numero) {
        this.numero = numero;
        this.itensPedido = new ArrayList<ItemPedido>();
        this.Formato = new DecimalFormat("#,##0.00");
    }

    public int getNumero() {
        return numero;
    }

    public double getTotal() {
        return total;
    }

    public void listar() {
        double totalGeral = 0;
        double total;
        
        System.out.println("Número do Pedido: " + Integer.toString(this.getNumero()) + "\n");
        System.out.println("Nome do Cliente: " + this.getCliente().getNome() + "\n");
        System.out.println("Código\tDescrição\tQtde. Vendida\tSubTotal");
        
        //iterating ArrayList
        for (ItemPedido itemPedido : itensPedido) {
            total = itemPedido.getQtdeVend() * itemPedido.getProduto().getPreco();
            totalGeral += total;
            
            System.out.println(Integer.toString(itemPedido.getProduto().getCodigo())
                    + "\t" + Double.toString(itemPedido.getProduto().getPreco())
                    + "\t\t" + Integer.toString(itemPedido.getQtdeVend())
                    + "\t\t" + this.Formato.format(total));
        }
        
        System.out.println("\n\t\t\t   Total geral: " + this.Formato.format(totalGeral));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void addItemPedido(ItemPedido itemPedido) {
        this.itensPedido.add(itemPedido);
    }
}
