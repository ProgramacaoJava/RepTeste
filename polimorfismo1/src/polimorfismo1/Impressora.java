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
public class Impressora extends Produto{

    public Impressora(String serie, String tipo, String nome, String velocidade) {
        super(serie, tipo, nome);
        this.velocidade_impr = velocidade;
    }
    

    public Impressora() {
    }
    
    public String velocidade_impr;
    
        @Override
 public void ligar(){
        System.out.println("A impressora esta pronta para receber documentos");
    }
    @Override
    public void desligar() {
        System.out.println("A impressora nao esta mais disponivel");        
    }
    
    public void imprimir() {
        System.out.println("Impressora esta em uso");
    }
}
