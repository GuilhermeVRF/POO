/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa.controleInterno;

/**
 *
 * @author suelen
 */
public class DeptosAutorizados {

    public final static String DEPTOS[] = {"Compras", "Financeiro", "Cliente", "Produ��o", "RH"};

    public static boolean validaDepto(String dpto) {

        boolean saida = false;

        for (int i = 0; i < DEPTOS.length; i++) {

            if (DEPTOS[i].equals(dpto)) {
                saida = true;
            }
        }

        return saida;
    }

}
