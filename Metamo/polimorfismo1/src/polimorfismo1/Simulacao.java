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
public class Simulacao {

    public Simulacao(Produto prod) {
        this.produto = prod;
    }

    public Simulacao() {
    }
    
    
    public Produto produto;
            
    public void testeProduto() {
        System.out.println("Produto: " + this.produto.nome);
        System.out.println("Tipo Serie: " + this.produto.tipo);
        System.out.println("No. Serie: " + this.produto.serie);
        this.produto.ligar();
        this.produto.desligar();       
    }
    
    public void testeComputador(Computador comp) {
        System.out.println("Velocidade Processamento: " + comp.velocidade_proc);
        comp.processar();
    }
    
    public void testeImpressora(Impressora impr) {
           System.out.println("Velocidade impressao: " + impr.velocidade_impr);
            impr.imprimir();
    }

}
