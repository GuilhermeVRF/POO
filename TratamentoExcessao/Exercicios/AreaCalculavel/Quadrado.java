/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TratamentoExcessao.Exercicios.AreaCalculavel;

/**
 *
 * @author guilh
 */
public class Quadrado implements OperacoesGeometricas{
    private double lado;
    
    public Quadrado(double lado){
        this.verificarParametro(lado);
        
        this.lado = lado;
    }
    
    public double getLado(){
        return this.lado;
    }
    
    private void verificarParametro(double lado){
        if(lado < 0){
            throw new IllegalStateException("Foi passado um valor negativo para o lado!");
        }
    }
    
    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 4* this.lado;
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName() +
                "\nLado: "+ this.lado;
    }
}
