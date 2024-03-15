/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TratamentoExcessao.Exercicios.CalculoMatematico;

/**
 *
 * @author guilh
 */
public class CalculoMatematico {
    public static int dividir(int numerador,int denominador){
        int resultadoDivisao;
        
        try{
            resultadoDivisao = numerador/denominador;
        }catch(ArithmeticException error){
            System.out.println("Divisão por zero!");
            resultadoDivisao = 0;
        }
        
        return resultadoDivisao;
    }    
}
