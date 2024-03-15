/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Jogo.JogoCartas;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author guilh
 */
public class DuplaTruco {
    private final String NOME_DUPLA;
    private HashSet<String> cartasJogador1;
    private HashSet<String> cartasJogador2;
    
    public DuplaTruco(String nomeDupla){
        this.NOME_DUPLA = nomeDupla;
        this.cartasJogador1 = new HashSet();
        this.cartasJogador1 = new HashSet();
    }
    
    public void jogarCarta(HashSet<String> cartasJogador, String cartaJogada){
        Iterator it = cartasJogador.iterator();
        while(it.hasNext()){
            if(it.next().equals(cartaJogada)){
                cartasJogador.remove(cartaJogada);
                return;
            }
        }
    }
    
    public HashSet<String> getJogador1(){
        return this.cartasJogador1;
    }
    
    public HashSet<String> getJogador2(){
        return this.cartasJogador2;
    }
}
