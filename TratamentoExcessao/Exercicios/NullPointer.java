/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TratamentoExcessao.Exercicios;

/**
 *
 * @author guilh
 */
public class NullPointer {
    public static void main(String[] args){
        
        try{
            Object o = null;
            o.toString();
        }catch(NullPointerException error){
            System.out.println("Objeto nulo!");
            error.printStackTrace();
        }    
    }
}
