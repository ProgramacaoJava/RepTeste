/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo1;

/**
 *
 * @author estudante
 */
public class Produto {

    public Produto(String tipo, String serie, String nome) {
        
        this.serie = serie;
        this.tipo = tipo;
        this.nome = nome;
    }

    public Produto() {
    }
    
    public String serie;
    public String tipo;
    public String nome;
    public void ligar(){
        System.out.println("produto ligado");
    }
    public void desligar() {
        System.out.println("produto desligado");        
    }
    
    
    
}


