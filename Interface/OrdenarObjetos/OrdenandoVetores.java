/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.OrdenarObjetos;

/**
 *
 * @author guilh
 */
public class OrdenandoVetores {
    public static void insertionSort(Comparavel[] objetosComparaveis){
        int posAtual = 1;
        int posAnterior;
        int posAtual_temp;
        
        while(posAtual < objetosComparaveis.length){
            posAnterior = posAtual - 1;
            Comparavel objetoAtual = objetosComparaveis[posAtual];
            while(posAnterior >= 0 && objetoAtual.compararCom(objetosComparaveis[posAnterior]) == -1 ){
                objetosComparaveis[posAnterior + 1] = objetosComparaveis[posAnterior];
                posAnterior--;
            }
            
            objetosComparaveis[posAnterior + 1] = objetoAtual;
            posAtual++;
        }    
    }      
}
