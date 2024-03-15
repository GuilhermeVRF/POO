/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Jogo.JogoCartas;

/**
 *
 * @author guilh
 */
public class Carta implements Comparable<Carta>{
    private String descCarta;
    private int valorCarta;
    
    public Carta(String descCarta, int valorCarta){
        this.descCarta = descCarta;
        this.valorCarta = valorCarta;
    }
    
    public String getDescCarta(){
        return this.descCarta;
    }
    
    public int getValorCarta(){
        return this.valorCarta;
    }
    
    @Override
    public int compareTo(Carta outraCarta){                   
            if(this.valorCarta > outraCarta.valorCarta){
                return 1;
            }else{
                return -1;
        }
    }
    
    @Override
    public String toString(){
        return this.descCarta + this.valorCarta;
    }
}
