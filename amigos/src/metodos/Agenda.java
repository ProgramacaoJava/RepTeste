/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Mr Matsinhe
 * classe para criacao da agenda amigos vs conhecidos
 */
public class Agenda{
   private int quantidadeAmigo;
   private int quantidadeConhecido;
   private Pessoa pessoas[];

    //criacao de amigos ou conhecido aleatoriamente
    public Agenda(int quantidade) {
        this.pessoas = new Pessoa[quantidade];
        
        for(int i=0; i<pessoas.length; i++){
            int op=1+(int)(Math.random()*2); //formula que permite fazre escolhas aleatorias
            if(op==1){
                Amigo a=new Amigo();
                pessoas[i]=a;
            }else{
                Conhecido c=new Conhecido();
                pessoas[i]=c;
            }
        }
        
        
    }

    public int getQuantidadeAmigo() {
        return quantidadeAmigo;
    }

    public void setQuantidadeAmigo(int quantidadeAmigo) {
        this.quantidadeAmigo = quantidadeAmigo;
    }

    public int getQuantidadeConhecido() {
        return quantidadeConhecido;
    }

    public void setQuantidadeConhecido(int quantidadeConhecido) {
        this.quantidadeConhecido = quantidadeConhecido;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public void addInformacao(){
        for(int i=0; i<pessoas.length; i++){
           String nome = JOptionPane.showInputDialog("Nome:");
           int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
           String aux="";
           int op = Integer.parseInt(JOptionPane.showInputDialog("1. Amigo\n2.Conhecido"));
           
           if(op==1){
            aux = JOptionPane.showInputDialog("Data de nascimento:");
            
            Amigo a=new Amigo();
            a.setNome(nome);
            a.setIdade(idade);
            a.setData(aux);
            pessoas[i]=a;
            quantidadeAmigo+=1;
           }else if(op==2){
            aux = JOptionPane.showInputDialog("Email:");
            
            Conhecido c=new Conhecido();
            c.setNome(nome);
            c.setIdade(idade);
            c.setEmail(aux);
            pessoas[i]=c;
            quantidadeConhecido+=1;
           }
        } 
           
    }
     // impressao dos aniversarios dos amigos
     public void imprimeAniversario(){
         String aux="Aniversarios\n\n";
       for(int i=0; i<pessoas.length; i++){
           if(pessoas[i] instanceof Amigo){
                Amigo a = (Amigo)pessoas[i];
                aux+=a.getData()+"\n";
           }
       }
                JOptionPane.showMessageDialog(null, aux);
    }
     
      // impressao do emails dos conhecido
     public void imprimeEmail(){
          String aux="Emals\n\n";
       for(int i=1; i<pessoas.length; i++){
           if(pessoas[i] instanceof Conhecido){
                Conhecido c = (Conhecido)pessoas[i];
                aux+=c.getEmail()+"\n";
           }
       }
                JOptionPane.showMessageDialog(null,aux);
   }
}
