/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Jogo.JogoCartas;

import EstruturaDeDados.ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;

/**
 *
 * @author guilh
 */
public class Baralho {
    private final ListaDuplamenteEncadeada<Carta> BARALHO;
    private final String[] DESC_BARALHO;
    
    public Baralho(){
        this.BARALHO = new ListaDuplamenteEncadeada<>();
        this.DESC_BARALHO =  new String[]{"8","7","6","Q","J","K","A","2","3","7O","E","7C","4Z"};
    }
    
    public void criarBaralho(){
        for(int posBaralho = 0; posBaralho < 13; posBaralho++){
            Carta carta = new Carta(this.DESC_BARALHO[posBaralho], posBaralho);
            this.BARALHO.addTail(carta);
        }
    }
    
    public ListaDuplamenteEncadeada getBARALHO(){
        return this.BARALHO;
    }
}
