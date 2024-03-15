/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceGrafica.Controle;

import InterfaceGrafica.Modelo.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilh
 */
public class ListaClientes {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public static void adicionarCliente(Cliente clienteCriado){
        listaClientes.add(clienteCriado);
    }
    
    public static ArrayList<Cliente> getListaClientes(){
        return listaClientes;
    }
}
