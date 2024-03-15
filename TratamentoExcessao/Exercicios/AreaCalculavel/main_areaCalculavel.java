/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TratamentoExcessao.Exercicios.AreaCalculavel;

/**
 *
 * @author guilh
 */
public class main_areaCalculavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2);
        Quadrado q1 = new Quadrado(2);
        Trapezio t1 = new Trapezio(4,2,2,2,3);
        
        System.out.println(CalculosGeometricos.calcularPerimetro(t1));
    }
    
}
