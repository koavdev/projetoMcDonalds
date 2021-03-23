/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Antonio Guilherme
 * @since 07/05/2019 - 11:38
 * @version 1.0 Beta Shen
 */
public class Cliente {
    private long idCliente;
    private String nome;
    private int idade;
    private long cpf;
    private int fone;
    private String email;

    public Cliente() {
    }

    public Cliente(long idCliente, String nome, int idade, long cpf, int fone, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.fone = fone;
        this.email = email;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
