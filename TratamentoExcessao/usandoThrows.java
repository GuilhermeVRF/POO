/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TratamentoExcessao;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class usandoThrows {

    public static double lerNumero() throws Exception{
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = Teclado.nextDouble();
        
        return num;
    }
    public static void main(String[] args) {
        
        try{
            double numero = lerNumero();
        }catch(Exception error){
            error.printStackTrace();
        }
    }
    
}
