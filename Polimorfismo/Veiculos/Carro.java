/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Veiculos;

/**
 *
 * @author guilh
 */
public class Carro extends Veiculo{
    private double kmRodado;
    
    public Carro(String modelo, double preco, double kmRodado){
        super(modelo, preco);
        this.kmRodado = kmRodado;
    }
    
    public void setKmRodado(double kmRodado){
        this.kmRodado = kmRodado;
    }
    
    public double getKmRodado(){
        return this.kmRodado;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(this.getClass() != o.getClass()){
            return false;
        }else{
            Carro carro = (Carro) o;
            return this.getModelo().equals(carro.getModelo()) && this.getPreco() == carro.getPreco() && this.kmRodado == carro.kmRodado;
        }
    }
    
    @Override
    public int hashCode(){
        return (int) (this.getModelo().hashCode() + this.getPreco() + this.getKmRodado());
    }
    
    public String toString(){
        return super.toString() +
                "\n Km rodado: "+ this.kmRodado;
    }
}
