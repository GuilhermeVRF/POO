/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import Empresa.cliente.Cliente;
import Empresa.controleInterno.SistemaInterno;
import Empresa.controleInterno.ControleBonificacao;
import Empresa.empregados.Diretor;
import Empresa.empregados.Gerente;
import Empresa.empregados.Secretaria;
import Empresa.empregados.Funcionario;

/**
 *
 * @author suelen
 */
public class Principal {

    public static void main(String[] args) {

        Funcionario f1 = new Secretaria("Maria", "0102");
        Gerente g = new Gerente(1234, "Joao", "0304", "Tesouraria");
        Diretor d = new Diretor("Paula", "0706", 5678);
        Cliente c = new Cliente("Guilherme", "1478", 1551);
        Secretaria s = new Secretaria("Marta", "0943");
        
        ControleBonificacao cb = new ControleBonificacao();

        f1.setSalario(1500.0);
        g.setSalario(5000.0);
        d.setSalario(15000);
        s.setSalario(2000);
        
        cb.regitra(f1);        
        cb.regitra(g);
        cb.regitra(d);        
        cb.regitra(s);

        SistemaInterno si = new SistemaInterno();
        
        si.login(c);
        
        System.out.println("Total de bonificacao a ser paga pela empresa é: R$"+cb.getTotalDeBonif());

    }

}
