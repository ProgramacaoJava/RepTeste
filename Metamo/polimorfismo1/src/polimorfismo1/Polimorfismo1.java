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
public class Polimorfismo1 {

    public static void main(String[] args) {
        Computador comp = new Computador("corporativo", "jjekwkjda2323", "computador 1", "3Ghz");
        Impressora impr = new Impressora("corporativo", "re89erwrfsdfs", "impressora 1", "4.5Ghz");

        Computador comp1 = new Computador("pessoal", "dfwe4324sdsfs", "computador 2", "6ppm");
        Impressora impr1 = new Impressora("pessoal", "fsr453rewrwrw", "impressora 2", "4ppm");

                
        Simulacao simula1 = new Simulacao(comp);
        simula1.testeProduto();
        simula1.testeComputador(comp);
        System.out.println("0--------------------------------------------------------0");
        Simulacao simula2 = new Simulacao(impr);
        simula2.testeProduto();
        simula2.testeImpressora(impr);
        System.out.println("0--------------------------------------------------------0");
        System.out.println("0--------------------------------------------------------0");

        Simulacao simula3 = new Simulacao(comp1);
        simula1.testeProduto();
        simula1.testeComputador(comp1);
        System.out.println("0--------------------------------------------------------0");
        Simulacao simula4 = new Simulacao(impr1);
        simula2.testeProduto();
        simula2.testeImpressora(impr1);
              
        
        
    
    }
    
}
