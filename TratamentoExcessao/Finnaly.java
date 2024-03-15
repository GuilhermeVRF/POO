/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TratamentoExcessao;


/**
 *
 * @author guilh
 */
public class Finnaly {
    public static double finallyComReturn(){
        try{
            return 2/0;
        }catch(Exception error){
            return 0;
        }finally{
            System.out.println("Sempre entrarei no finally!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = {4,8,16,32,64,128};
        int[] divisor = {2,0,4,8,0};
        
        /*for(int i = 0;i < num.length;i++){
            try{
                System.out.println(num[i] + "/"+ divisor[i] + " = "+ num[i]/divisor[i]);              
            }catch(ArrayIndexOutOfBoundsException erroIndex){
                 System.out.println("Excessão: "+ erroIndex.getMessage());
            }catch(ArithmeticException erroMatematico){
                 System.out.println("Excessão: "+ erroMatematico.getMessage());
            }catch(Throwable erroMamtematico){
                System.out.println("Excessão: "+ erroMamtematico.getMessage());
            }finally{
                System.out.println("Essa mensagem sempre será exibida!");
            }
        }*/
        
        System.out.println(finallyComReturn());
    }
}
