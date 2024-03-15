/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.Jogo.JogoBola;


/**
 *
 * @author guilh
 */
public abstract class JogoDeBola implements Jogo{
    private boolean jogoAndamento;
    private final String equipeMandante;
    private final String equipeVisitante;
    private int pontuacaoMandante;
    private int pontuacaoVisitante;
    
    public JogoDeBola(String equipeMandante, String equipeVisitante){
        this.equipeMandante = equipeMandante;
        this.equipeVisitante = equipeVisitante;
        this.pontuacaoMandante = 0;
        this.pontuacaoVisitante = 0;
        this.jogoAndamento = false;
    }    
    
    public void setJogoIniciou(boolean jogoAndamento){
        this.jogoAndamento = jogoAndamento;
    }
    
    public boolean getJogoAndamento(){
        return this.jogoAndamento;
    }
    
    public String getEquipeMandante(){
        return this.equipeMandante;
    }
    
    public String getEquipeVisitante(){
        return this.equipeVisitante;
    }
    
    public int getPontuacaoMandante(){
        return this.pontuacaoMandante;
    }
    
    public int getPontuacaoVisitante(){
        return this.pontuacaoVisitante;
    }
    public String placar(){
        return this.equipeMandante + " "+ this.pontuacaoMandante + " x "+ this.pontuacaoVisitante + " "+ this.equipeVisitante;
    }
    
    public void pontoMandante(){
        this.pontuacaoMandante++;
    }
    
    public void pontoVisitante(){
        this.pontuacaoVisitante++;
    }
    
    @Override
    public abstract String iniciar();
    @Override
    public abstract void jogar();
    @Override
    public abstract String finalizar();
    
}
