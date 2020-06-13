/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author marcelo
 */
public class Cliente extends Pessoa {
    private double limite;
    private ArrayList<Pedido> pedidos;
    private int numPed;
    
    public Cliente(int codigo, String nome, double limite) {
        super(codigo, nome);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public int getNumPed() {
        return numPed;
    }
    
    public void atualizarLimite(double subTotal) {
        this.limite -= subTotal;
    }
}
