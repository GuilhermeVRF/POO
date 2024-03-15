/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Veiculos;

/**
 *
 * @author guilh
 */
public abstract class Veiculo {
    private String modelo;
    private double preco;
    
    public Veiculo(String modelo, double preco){
        this.modelo =modelo;
        this.preco = preco;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setPreco(double preco){
        this.preco= preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(this.getClass() != o.getClass()){
            return false;
        }else{
            Veiculo veiculo = (Veiculo) o;
            return this.modelo.equals(veiculo.modelo) && this.preco == veiculo.preco;
        }
    }
    
    @Override
    public int hashCode(){
        return (int) (this.modelo.hashCode() + this.preco);
    }
    
    @Override
    public String toString(){
        return "Modelo: "+ this.modelo +
                "\nPreço: R$"+ this.preco;
    }
}
