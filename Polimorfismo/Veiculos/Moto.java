/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo.Veiculos;

/**
 *
 * @author guilh
 */
public class Moto extends Veiculo{
    private int anoFabricacao;
    
    public Moto(String modelo, double preco, int anoFabricacao){
        super(modelo, preco);
        this.anoFabricacao = anoFabricacao;
    }
    
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    
    public int getAnoFabricacao(){
        return this.anoFabricacao;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if(this.getClass() != o.getClass()){
            return false;
        }else{
            Moto moto =(Moto)o;
            
            return this.getModelo().equals(moto.getModelo())&& this.getPreco() == moto.getPreco() && this.anoFabricacao == moto.anoFabricacao;
        }
    }
    
    @Override
    public int hashCode(){
        return (int) (this.getModelo().hashCode() + this.getPreco() + this.anoFabricacao);
    }
    
    @Override
    public String toString(){
        return super.toString()+
                "Ano de fabricação: "+ this.anoFabricacao;
    }
}
