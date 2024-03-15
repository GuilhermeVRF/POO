/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TratamentoExcessao.Exercicios.AreaCalculavel;

/**
 *
 * @author guilh
 */
public class Circulo implements OperacoesGeometricas{
    private double raio;
    
    public Circulo(double raio){
        this.verificarParametro(raio);
        
        this.raio = raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }    
    
    public double getRaio(){
        return this.raio;
    }
    
    private void verificarParametro(double raio){
        if(raio < 0){
            throw new IllegalStateException("Foi passado um valor negativo para o raio!");
        }
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * (this.raio * this.raio);
    }
    
    @Override
    public double calcularPerimetro(){
        //Comprimento = 2PIR
        return 2*(Math.PI * this.raio);
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName() +
                "\nRaio: "+ this.raio;
    }
}
