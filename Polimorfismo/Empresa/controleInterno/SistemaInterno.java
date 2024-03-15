/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa.controleInterno;

import Empresa.cliente.Cliente;
import Empresa.empregados.Diretor;
import Empresa.empregados.Gerente;
import java.util.Scanner;

/**
 *
 * @author suelen
 */
public class SistemaInterno {
    
    final Scanner TECLADO = new Scanner(System.in);
    
    public void login (Autenticavel autenticavel){
        
        System.out.println("Informe sua senha: ");
        int senha = TECLADO.nextInt();
        
        if(autenticavel.autenticar(senha)){
            if(autenticavel instanceof Gerente){
                Gerente g = (Gerente) autenticavel;
                
                System.out.println("Gerente: "+ g.getNome() + " logado com sucesso!");
            }else if(autenticavel instanceof Diretor){
                Diretor d = (Diretor) autenticavel;
                
                System.out.println("Diretor: "+ d.getNome() + " logado com sucesso!");
            }else if(autenticavel instanceof Cliente){
                Cliente c = (Cliente) autenticavel;
                
                System.out.println("Cliente: "+ c.getNome() + " logado com sucesso!");
            }
        }
        
    }
    
}
