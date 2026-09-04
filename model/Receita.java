//Vinicius G. Domingues

package model;

public class Receita{
    private String origem;
    private double valor;
    
// construtor

    public Receita(String origem, double valor) {
        this.origem = origem;
        this.valor = valor;
        
    }

 
//  getters e setters 

 public double getOrigem (String origem){
        return this.origem;
    }
    
    public void setOrigem (String origem ){
        this.origem = cliente;
    }
    
    public double getValor (){
        return this.origem;
    }
    
    public void setValor (String valor){
        this.valor = valor;
    }
    
}