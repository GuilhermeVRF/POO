/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa.cliente;

import Empresa.controleInterno.Autenticavel;

/**
 *
 * @author guilh
 */
public class Cliente implements Autenticavel{
    private String nome;
    private String cpf;
    private int senha;
    private double gastoTotal;
    
    public Cliente(String nome, String cpf, int senha){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.gastoTotal = 0.0;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    public int getSenha(){
        return this.senha;
    }
    
    public void setGastoTotal(double gastoTotal){
        this.gastoTotal = gastoTotal;
    }
    
    public double getGastoTotal(){
        return this.gastoTotal;
    }
    
    @Override
    public boolean autenticar(int senha){
        
        System.out.println("Sou o(a) Cliente "+ this.nome +
                "e estou validando minha senha!");
        
        return senha == this.senha;
    }
}
