 // kiara da silva //
 
package model;

 // atributos //
 
    public class Conta {
        
        private int numero;
        private String cliente;
        private double saldo;
        private double limite;
        
      
      // construtor //
      
    public conta (int numero, String cliente, double saldo, double limite){
         
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
         
     } 
       
        // getter and setters //
        
    public String getConta (){
        return this.conta;
        
    }
    
    public void setConta (String conta ){
        this.conta = conta;
    }
    
     
      
      // getters setters //
      
    public double getNumero (){
        return this.numero;
    }
    
    public void setNumero (String numero){
        this.numero = cliente;
    }
    
    public double getCliente (){
        return this.numero;
    }
    
    public void setCliente (String cliente){
        this.cliente = cliente;
    }
    
    public double getSaldo (){
        return this.saldo;
    }
    
    public void setSaldo (String saldo){
        this.saldo = saldo;
    }
    
    public double getLimite (){
        return this.limite;
    }
    
    public void setLimite (String limite){
        this.limite = limite;
    }
    
    
    
}
    
    
    