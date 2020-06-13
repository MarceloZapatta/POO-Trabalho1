
import fatec.poo.model.Pedido;
import java.text.DecimalFormat;
import fatec.poo.model.*;

//1o. Trabalho Programação de Orientada a Objetos

public class Aplic {
    public static void main(String[] args) {
        DecimalFormat Formato = new DecimalFormat("#,##0.00");
        
        
        //Relação de Vendedores
        Vendedor v1 = new Vendedor(100,"Joaquim Silva ", 3.0);
        Vendedor v2 = new Vendedor(200,"Carlos Manoel ", 2.5);
        Vendedor v3 = new Vendedor(300,"Antonio Santos", 3.0);
        Vendedor v4 = new Vendedor(400,"Ricardo Souza ", 4.5);
        Vendedor v5 = new Vendedor(500,"Sergio Cabral ", 3.5);
        
        //Relação de Clientes
        Cliente c1=new Cliente(1010, "Pedro da Silva", 5000);
        Cliente c2=new Cliente(2020, "Ana Beatriz   ", 4000);
        Cliente c3=new Cliente(3030, "Tiago Souza   ", 3000);
         
        //************************************      
        //Pedido 1  - Vendedor 1 - Cliente 1
        //************************************               
        Pedido ped1=new Pedido(1);           
        Produto pr1=new Produto(111, "Cadeira Escolar      ", 34);
        pr1.setPreco(25.0);
        Produto pr2=new Produto(222, "Mesa Escolar         ", 58);
        pr2.setPreco(80.0);
        Produto pr3=new Produto(333, "Lousa Branca 3x5     ", 88);
        pr3.setPreco(100.0);
        
        ItemPedido It1 = new ItemPedido(pr1,15);
        ItemPedido It2 = new ItemPedido(pr2,13);
        ItemPedido It3 = new ItemPedido(pr3,10);
        
        //Associações Binárias
        ped1.setVendedor(v1);
        ped1.setCliente(c1);
        ped1.addItemPedido(It1);
        ped1.addItemPedido(It2);
        ped1.addItemPedido(It3);
        v1.addPedido(ped1);
        
        //***************************************************
        //Listagem do Pedido1
        //Exibe a relação dos produtos inclusos no pedido
        //conforme lay-out do item (d) do trabalho
        //****************************************************
        ped1.listar();
        
        //************************************      
        //Pedido 2  - Vendededor 2 - Cliente 2
        //************************************
        Pedido ped2=new Pedido(2);        
        Produto pr4=new Produto(444, "Pacote Folha A4      ", 25);
        pr4.setPreco(15.0);
        Produto pr5=new Produto(555, "Pacote Folha Carta   ", 30);
        pr5.setPreco(8.50);
        ItemPedido It4 = new ItemPedido(pr4,15);
        ItemPedido It5 = new ItemPedido(pr5,10);
        
        //Associações Binárias
        ped2.setVendedor(v2);
        ped2.setCliente(c2);
        ped2.addItemPedido(It4);
        ped2.addItemPedido(It5);      
        v2.addPedido(ped2);
        
        //************************************      
        //Pedido 3  - Vendededor 1 - Cliente 1
        //************************************
        Pedido ped3=new Pedido(3);
        Produto pr6=new Produto(666, "Caixa de Boorracha   ", 40);
        pr6.setPreco(5.0);
        ItemPedido It6 = new ItemPedido(pr6,21);
       
        
        //Associações Binárias
        ped3.setVendedor(v1);
        ped3.setCliente(c1);
        ped3.addItemPedido(It6); 
        v1.addPedido(ped3);
        
        
        //************************************      
        //Pedido 4  - Vendedor 4 - Cliente 3
        //************************************
        Pedido ped4=new Pedido(4);          
        Produto pr7=new Produto(777, "Caixa da Giz         ", 20);
        Produto pr8=new Produto(888, "Caixa de Lapis de Cor", 30);
        ItemPedido It7 = new ItemPedido(pr7,18);
        pr7.setPreco(10.0);
        ItemPedido It8 = new ItemPedido(pr8,17); 
        pr8.setPreco(12.0);
        
        //Associações Binárias
        ped4.setVendedor(v4);
        ped4.setCliente(c3);
        ped4.addItemPedido(It7); 
        ped4.addItemPedido(It8); 
        v4.addPedido(ped4);
        
        //************************************      
        //Pedido 5 - Vendedor 2 - Cliente 3
        //************************************
        Pedido ped5=new Pedido(5);       
        Produto pr9=new Produto(999, "Caixa Compasso       ", 60);
        Produto pr10=new Produto(123, "Caixa Regua 15 cm    ", 100);
        ItemPedido It9 = new ItemPedido(pr9,45);
        pr9.setPreco(35.0);
        ItemPedido It10 = new ItemPedido(pr10,78);
        pr10.setPreco(18.0);
        
        //Associações Binárias
        ped5.setVendedor(v2);
        ped5.setCliente(c3);
        ped5.addItemPedido(It9); 
        ped5.addItemPedido(It10);
        v2.addPedido(ped5);
        
        //***************************************************
        //Listagem dos pedidos emitidos de cada Vendedor
        //conforme lay-out do item (c) do trabalho
        //****************************************************
        v1.listarPedidos();
        v2.listarPedidos();
        v3.listarPedidos();
        v4.listarPedidos();
        v5.listarPedidos();
    }
}
