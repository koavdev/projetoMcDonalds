/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Antonio Guilherme
 * @since 07/05/2019 - 11:23
 * @version 1.0 Beta Shen
 */
public class Pedido {
    private long idPedido;
    private String hamburguer;
    private String bebida;
    private String batata;
    private String sobremesa;
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(long idPedido, String hamburguer, String bebida, String batata, String sobremesa, Cliente cliente) {
        this.idPedido = idPedido;
        this.hamburguer = hamburguer;
        this.bebida = bebida;
        this.batata = batata;
        this.sobremesa = sobremesa;
        this.cliente = cliente;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public String getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(String hamburguer) {
        this.hamburguer = hamburguer;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getBatata() {
        return batata;
    }

    public void setBatata(String batata) {
        this.batata = batata;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public double calcularTotal(){
        double cheddar = 7;
        double bigmac = 9;
        double quarteirao = 8;
        double pequena = 4;
        double media = 5;
        double grande = 7;
        double agua = 3;
        double refrigerante = 5;
        double suco = 7;
        double casquinha = 2;
        double mccolosso = 6;
        double mcflurry = 8;
        if(hamburguer.equals("Cheddar") && batata.equals("Pequena") && bebida.equals("Água") && sobremesa.equals("Casquinha")){
           return cheddar + pequena + agua + casquinha;   
        }
        if(hamburguer.equals("BigMac") && batata.equals("Média") && bebida.equals("Refrigerante") && sobremesa.equals("McColosso")){
           return bigmac + media + refrigerante + mccolosso;   
        }
        if(hamburguer.equals("Quarteirão") && batata.equals("Grande") && bebida.equals("Suco") && sobremesa.equals("McFlurry")){
           return quarteirao + grande + suco + mcflurry;   
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", hamburguer=" + hamburguer + ", bebida=" + bebida + ", batata=" + batata + ", sobremesa=" + sobremesa + ", cliente=" + cliente + '}';
    }


    
    
    
}
