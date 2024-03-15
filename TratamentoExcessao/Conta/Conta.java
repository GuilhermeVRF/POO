/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TratamentoExcessao.Conta;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilh
 */
public class Conta {
    private int idConta;
    private String titular;
    private double saldo;
    
    public Conta(int idConta, String titular, double saldo){
        this.idConta = idConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }else{
            try {
                throw new MinhaExcessao(valor, "Valor negativo passado como parâmetro!");
            } catch (MinhaExcessao ex) {
                ex.printStackTrace();
            }
        }
    }
}
