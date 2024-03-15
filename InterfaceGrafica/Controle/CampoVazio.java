/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceGrafica.Controle;

/**
 *
 * @author guilh
 */
public class CampoVazio extends Exception{
    private String mensagem;
    
    public CampoVazio(String mensagem){
        this.mensagem = mensagem;
    }
    
    @Override
    public String toString(){
        return mensagem;
    }
}
