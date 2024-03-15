/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface.OrdenarObjetos;

/**
 *
 * @author guilh
 */
public class Pessoa implements Comparavel{
    private String nome;
    private String cpf;
    private int idade;
    
    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    @Override
    public int compararCom(Object o) throws ClassCastException{
        if(o instanceof Pessoa){
            Pessoa outraPessoa = (Pessoa) o;
            if(this.idade > outraPessoa.idade){
                return 1; 
            }else{
                return -1;
            }
        }else{
            throw new ClassCastException("Objetos de diferentes classes: "+ this.getClass().getSimpleName() +
                " | "+o.getClass().getSimpleName());
        }
    }
    
    @Override
    public String toString(){
        return this.nome +" | "+ this.idade;
    }
}
