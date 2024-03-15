/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Jogo.JogoCartas;

/**
 *
 * @author guilh
 */
public abstract class JogoDeCartas implements Jogo{
    private boolean jogoAndamento;
    private final int TOTAL_CARTAS = 52;
    private int cartasUsadas;
    
    public void setCartasUsadas(int cartasUsadas){
        this.cartasUsadas = cartasUsadas;        
    }
    
    public void setJogoAndamento(boolean jogoAndamento){
        this.jogoAndamento = jogoAndamento;
    }
    
    public boolean getJogoAndamento(){
        return this.jogoAndamento;
    }
    
    public int getCartasUsadas(){
        return this.cartasUsadas;
    }
    
    public int getTOTAL_CARTAS(){
        return this.TOTAL_CARTAS;
    }
    
    public abstract void distribuirCartas();
    
    @Override
    public String iniciar(){
        this.jogoAndamento = true;
        return "Jogo de "+ this.getClass().getSimpleName()+ " iniciado! ";
    }
    
    @Override
    public abstract void jogar();
    @Override
    
    public String finalizar(){
        this.jogoAndamento = false;
        return "Jogo de "+ this.getClass().getSimpleName() + " finalizado!";
    }   
}
