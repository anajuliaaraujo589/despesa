//ana julia cordeiro//
package model;
public class Despesa {
    
    //atributos
    private String descricao;
    private double valor;
    private String status;

    //construtor 2 parametros
    public Despesa(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    //getters setters
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 

    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

