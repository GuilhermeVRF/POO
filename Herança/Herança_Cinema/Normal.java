/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança.Herança_Cinema;

/**
 *
 * @author guilh
 */
public class Normal extends Ingresso{
    public Normal(double preco){
        super(preco);
    }
    @Override
    public String toString(){
        return super.toString() + " � o valor de um ingresso Normal!";
    }
}
