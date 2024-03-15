/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TratamentoExcessao.Conta;

/**
 *
 * @author guilh
 */
public class MinhaExcessao extends Exception{
    private final double NUMERO_NEGATIVO;
    
    public MinhaExcessao(double numeroNegativo, String mensagemErro){
        super(mensagemErro);
        this.NUMERO_NEGATIVO = numeroNegativo;
    }
    
    @Override
    public String toString(){
        return this.getMessage() + " R$"+ this.NUMERO_NEGATIVO;
    }
}
