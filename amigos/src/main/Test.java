/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import metodos.Agenda;
import metodos.Amigo;


/**
 *
 * @author MrUAMBA
 */
public class Test {
    
    
    
    public static void main(String[] args) {
     int quant= Integer.parseInt( JOptionPane.showInputDialog(" Quantos deseja colocar na agenda"));
     
      Agenda agenda =new Agenda(quant);
//      agenda.addInformacao();
//      JOptionPane.showMessageDialog(null, "Amigos: "+agenda.getQuantidadeAmigo()+"\nConhecidos: "+agenda.getQuantidadeConhecido());
//      agenda.imprimeAniversario();
//      agenda.imprimeEmail();
      
      int op=0;
        do{
             op=Integer.parseInt(JOptionPane.showInputDialog(""
                + "1.cadastrar\n"
                + "2.Listar Aniversario"
                 + "\n0.Sair"));
        
            switch(op){
                case 1:agenda.addInformacao(); break;
                case 2:agenda.imprimeAniversario(); break;
                case 0: System.exit(0);
                    
            }
        }while(op!=0);
    }
    
}
