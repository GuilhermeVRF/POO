/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TratamentoExcessao;

/**
 *
 * @author guilh
 */
public class TratamentoExcessao {
    public static void main(String[] args){
        int[] vet = new int[4];
        System.out.println("Mensagens antes da excessão!");
        
        try{
            vet[4] = 1;
        }catch(ArrayIndexOutOfBoundsException erro){
            System.out.println("Excessão: " + erro.getMessage());
        }
        System.out.println("Essa mensagem não será exibida!");
    }
}
