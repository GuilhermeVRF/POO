/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Jogo.JogoCartas;

import EstruturaDeDados.ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author guilh
 */
public class Truco extends JogoDeCartas{
    
    private final DuplaTruco PRIMEIRA_DUPLA;
    private final DuplaTruco SEGUNDA_DUPLA;
    private int pontuacao_primeiraDupla;
    private int pontuacao_segundaDupla;
    private ListaDuplamenteEncadeada<HashSet<String>> jogadores;
    
    public Truco(String primeiraDupla, String segundaDupla){
        this.PRIMEIRA_DUPLA = new DuplaTruco(primeiraDupla);
        this.SEGUNDA_DUPLA = new DuplaTruco(segundaDupla);
        jogadores.addTail(this.PRIMEIRA_DUPLA.getJogador1());
        jogadores.addTail(this.PRIMEIRA_DUPLA.getJogador2());
        jogadores.addTail(this.SEGUNDA_DUPLA.getJogador1());
        jogadores.addTail(this.SEGUNDA_DUPLA.getJogador2());
        this.pontuacao_primeiraDupla = 0;
        this.pontuacao_segundaDupla = 0;
    }
    
    @Override
    public void jogar(){
        if(this.getJogoAndamento()){
            
        }
    }
    
    @Override
    public void distribuirCartas(){
       Baralho copag = new Baralho();    
       Iterator<Carta> it = copag.getBARALHO().iterator();
       Iterator<HashSet<String>> cartasJogadores = jogadores.iterator();
       
       while(cartasJogadores.hasNext()){
           int contCartasDistribuidas = 0;
           do{
               
           }while(contCartasDistribuidas < 3);
       }
       
    }
    
    public void embaralhar(){
        Baralho copag = new Baralho();    
        Iterator<Carta> it = copag.getBARALHO().iterator();
        
    }
}
