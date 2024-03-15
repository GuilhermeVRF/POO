/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TratamentoExcessao.Exercicios.AreaCalculavel;

/**
 *
 * @author guilh
 */
public class Trapezio implements OperacoesGeometricas{
    private double primeiraBase;
    private double segundaBase;
    private double ladoEsquerdo;
    private double ladoDireito;
    private double altura;
    
    public Trapezio(double primeiraBase, double segundaBase, double ladoEsquerdo, double ladoDireito, double altura){
        this.verificarParametros_Construtor(primeiraBase, segundaBase, ladoEsquerdo, ladoDireito, altura);
        
        this.primeiraBase = primeiraBase;
        this.segundaBase = segundaBase;
        this.ladoEsquerdo = ladoEsquerdo;
        this.ladoDireito = ladoDireito;
        this.altura = altura;
    }
    
    public void setPrimeiraBase(double primeiraBase){
        try{
            this.verificarBasePositiva(primeiraBase);
            this.primeiraBase = primeiraBase;
        }catch(IllegalStateException error){
            System.out.println(error.getMessage());
        }
    }
    
    public void setSegundaBase(double segundaBase){
        try{
            this.verificarBasePositiva(segundaBase);
            this.segundaBase = segundaBase;
        }catch(IllegalStateException error){
            System.out.println(error.getMessage());
        }
    }
    
    public void setAltura(double altura){
        try{
            this.verificarAlturaPositiva(altura);
            this.altura = altura;
        }catch(IllegalStateException error){
            System.out.println(error.getMessage());
        }
    }
    
    public void setLadoEsquerdo(double ladoEsquerdo){
        try{
            this.verificarLadoEsquerdoPositivo(ladoEsquerdo);
            this.ladoEsquerdo = ladoEsquerdo;
        }catch(IllegalStateException error){
            System.out.println(error.getMessage());
        }
    }
    
    public void setLadoDireito(double ladoDireito){
        try{
            this.verificarLadoDireitoPositivo(ladoDireito);
            this.ladoDireito = ladoDireito;
        }catch(IllegalStateException error){
            System.out.println(error.getMessage());
        }
    }
    
    private void verificarBasePositiva(double base) throws IllegalStateException{
        if(base < 0){
            throw new IllegalStateException("Valor negativo passado como parâmetro para a base!");
        }
    }
    
    private void verificarAlturaPositiva(double altura) throws IllegalStateException{
        if(altura < 0){
            throw new IllegalStateException("Valor negativo passado como parâmetro para a altura!");
        }
    }
    
    private void verificarLadoEsquerdoPositivo(double ladoEsquerdo) throws IllegalStateException{
        if(ladoEsquerdo < 0){
            throw new IllegalStateException("Valor negativo passado como parâmetro para o lado esquerdo!");
        }
    }
    
    private void verificarLadoDireitoPositivo(double ladoDireito) throws IllegalStateException{
        if(ladoDireito < 0){
            throw new IllegalStateException("Valor negativo passado como parâmetro para o lado direito!");
        }
    }
    private void verificarParametros_Construtor(double baseMaior, double baseMenor, double ladoEsquerdo, double ladoDireito, double altura){
        this.verificarBasePositiva(baseMaior);
        this.verificarBasePositiva(baseMenor);
        this.verificarAlturaPositiva(altura);
        this.verificarLadoEsquerdoPositivo(ladoEsquerdo);
        this.verificarLadoDireitoPositivo(ladoDireito);
    }
    
    @Override
    public double calcularArea(){
        return ((this.primeiraBase + this.segundaBase) * this.altura)/2;
    }
    
    @Override
    public double calcularPerimetro(){
        return this.primeiraBase + this.segundaBase + this.ladoEsquerdo + this.ladoDireito;
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName() +
                "\nBase menor: "+ this.segundaBase +
                "\nBase maior: "+ this.primeiraBase +
                "\nLado esquerdo: "+ this.ladoEsquerdo +
                "\nLado direito: "+ this.ladoDireito;
    }
}
