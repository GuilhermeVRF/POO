/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Jogo.JogoBola;
import java.util.Random;
/**
 *
 * @author guilh
 */
public class Futebol extends JogoDeBola{
    private int tempo;
    
    public Futebol(String equipeMandante, String equipeVisitante){
        super(equipeMandante,equipeVisitante);
        this.tempo = 0;
    }
    
    @Override
    public String iniciar(){
        this.setJogoIniciou(true);
        return "Começaaaaa o jogo!\n"+ this.placar();
    }
    
    @Override
    public void jogar(){
        if(this.getJogoAndamento()){
            Random Aleatorio = new Random();
            while(this.tempo <= 90){
                
                int chanceGol = Aleatorio.nextInt(0,1000);             
                
                if(chanceGol <= 15){
                    
                    this.pontoMandante();
                    System.out.println("GOOOOOOL! "+ this.getEquipeMandante() + " marca aos "+ this.tempo);
                    
                }
                
                if(chanceGol >= 985){
                    
                    this.pontoVisitante();
                    System.out.println("GOOOOOOL! "+ this.getEquipeVisitante() + " marca aos "+ this.tempo);
                
                }    
                System.out.println("Tempo de jogo: "+ this.tempo +"° | " + this.placar());
                this.cronometro();
            }
            
            System.out.println(this.finalizar());
            
        }else{
            System.out.println("O jogo ainda não foi inciado!");
        }
    }
    
    @Override
    public String finalizar(){
        this.setJogoIniciou(false);
        return "Final de jogo!\n"+this.placar();
    }
    
    private void cronometro(){
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ex) {
            System.out.println("Programa interrompido! ");
        }
        
        this.tempo++;
    }
}
