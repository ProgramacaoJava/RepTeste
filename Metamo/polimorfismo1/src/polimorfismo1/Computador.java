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
public class Computador  extends Produto{

    public Computador(String serie, String tipo, String nome, String velocidade) {
        super(serie, tipo, nome);
        this.velocidade_proc = velocidade;
    }
    public String velocidade_proc;

    public Computador() {
    }
    
    @Override
 public void ligar(){
        System.out.println("O computador esta pronto para o uso");
    }
    @Override
    public void desligar() {
        System.out.println("O computador ja pode ser deslidado com seguranca");        
    }    
    
    public void processar() {
        System.out.println("Computador processando");
                
    }
    
    
}
