/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TratamentoExcessao.Exercicios.AreaCalculavel;

/**
 *
 * @author guilh
 */
public class CalculosGeometricos {
    public static double calcularArea(OperacoesGeometricas figura){
        System.out.println(figura.toString());
        return figura.calcularArea();
    }    
    
    public static double calcularPerimetro(OperacoesGeometricas figura){
        System.out.println(figura.toString());
        return figura.calcularPerimetro();
    }
}
