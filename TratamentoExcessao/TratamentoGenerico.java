/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TratamentoExcessao;

import TratamentoExcessao.Conta.MinhaExcessao;

/**
 *
 * @author guilh
 */
public class TratamentoGenerico {

    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128};
        int[] divisor = {2, 0, 4, 8, 0};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + "/" + divisor[i] + " = " + num[i] / divisor[i]);
                throw new MinhaExcessao(-10, "Valor negativo!");
            } catch (MinhaExcessao | ArithmeticException erro) {
                erro.printStackTrace();
            }
        }
    }
}
