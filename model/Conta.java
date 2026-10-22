package model; 
public class Conta { 
   
    private int numero; 
    private String cliente; 
    private double saldo; 
    private double limite; 

 
    public Conta() {}

   
    public Conta (int numero, String cliente, double saldo, double limite){ 
        this.numero = numero; 
        this.cliente = cliente; 
        this.saldo = saldo; 
        this.limite = limite; 
    } 

    // --- GETTERS e SETTERS ---

    
    public int getNumero (){ 
        return this.numero; 
    } 
    public void setNumero (int numero){ 
        this.numero = numero; 
    } 

    // Cliente (é do tipo String)
    public String getCliente (){ 
        return this.cliente; 
    } 
    public void setCliente (String cliente){ 
        this.cliente = cliente; 
    } 

    // Saldo (é do tipo double)
    public double getSaldo (){ 
        return this.saldo; 
    } 
    public void setSaldo (double saldo){ 
        this.saldo = saldo; 
    } 

    // Limite (é do tipo double)
    public double getLimite (){ 
        return this.limite; 
    } 
    public void setLimite (double limite){ 
        this.limite = limite; 
    } 
}

