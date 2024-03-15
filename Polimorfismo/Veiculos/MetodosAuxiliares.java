/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Veiculos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class MetodosAuxiliares {
    
    static ArrayList<Veiculo> arrVeiculos = new ArrayList<>();
    static Scanner Teclado;
    
    public static void criarVeiculo(String param){
        
        Teclado = new Scanner(System.in);
        
        System.out.print("Modelo: ");
        String modelo = Teclado.nextLine();
        
        System.out.print("Preço: R$");
        double preco = Teclado.nextDouble();
        
        if(param.equals("Moto")){
            System.out.println("Ano de fabricação: ");
            int anoFabricacao = Teclado.nextInt();
            
            arrVeiculos.add(new Moto(modelo, preco, anoFabricacao));
        }else{
            System.out.println("Km rodados: ");
            double kmRodado = Teclado.nextDouble();
            
            arrVeiculos.add(new Carro(modelo, preco, kmRodado));
        }
    }
}
