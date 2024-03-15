/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interface.OrdenarObjetos;

/**
 *
 * @author guilh
 */
public class main_OrdenarObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa[] arr = new Pessoa[5];
        
        arr[0] = new Pessoa("Wander", "1", 50);
        arr[1] = new Pessoa("Guilherme", "1", 18);
        arr[2] = new Pessoa("Lavinia", "1", 10);
        arr[3] = new Pessoa("Lavinia", "1", 1);
        arr[4] = new Pessoa("Lavinia", "1", 2);
        OrdenandoVetores.insertionSort(arr);
        
        for(int i = 0;i < 5;i++){
            System.out.println(arr[i]);
        }
    }
    
}
