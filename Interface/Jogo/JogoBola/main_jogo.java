/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Jogo.JogoBola;

/**
 *
 * @author guilh
 */
public class main_jogo {
    public static void main(String[] args){
        Futebol partida = new Futebol("Atlético-MG", "Cruzeiro");
    
        partida.iniciar();
        partida.jogar();
    }            
}
