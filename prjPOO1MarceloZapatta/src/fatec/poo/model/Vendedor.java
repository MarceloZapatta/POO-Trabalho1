/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author marcelo
 */
public class Vendedor extends Pessoa {
    private String dataAdmissao;
    private double taxaComissao;
    private final double totalVendas;
    private ArrayList<Pedido> pedidos;
    private final DecimalFormat Formato;
    
    public Vendedor(int codigo, String nome, double totalVendas) {
        super(codigo, nome);
        
        this.pedidos = new ArrayList<Pedido>();
        this.totalVendas = totalVendas;
        this.Formato = new DecimalFormat("#,##0.00");
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void listarPedidos() {
        double valorComissao;
        double totalPedidos = 0;
        double totalComissao = 0;
        
        System.out.println("\n\tRelação de Pedidos Emitidos");
        System.out.println("\nCódigo: " + Integer.toString(this.getCodigo()) +
                "\t\tTaxa de comissão(%): " + Double.toString(this.getTaxaComissao()));
        System.out.println("\nNome: " + this.getNome());
        
        for (Pedido pedido : pedidos) {
            valorComissao = pedido.getTotal() * this.getTaxaComissao();
            
            totalComissao += valorComissao;
            totalPedidos += pedido.getTotal();
            
            System.out.println("No. Pedido\tValor do Pedido\tTotal Comissão");
            System.out.println(Integer.toString(pedido.getNumero()) +
                    "\t" + this.Formato.format(pedido.getTotal()) +
                    "\t" + this.Formato.format(valorComissao));
        }
        
        System.out.println("\nTotal geral\t" + this.Formato.format(totalPedidos) + 
                "\t" + this.Formato.format(totalComissao));
    }
}
