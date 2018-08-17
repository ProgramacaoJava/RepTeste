/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Matsinhe
 * 
 * esta eh classe mae ou super mae 
 */
public class Pessoa{
  private String nome;
  private int idade;

    //metodo que recebe nome e idade por parametro
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // inicializacao dos dados nesse metodo
    public Pessoa() {
        this.nome = "indefenido";
        this.idade = 0;
    }
// os Respectivos gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    // impressao dos dados  
    @Override
    public String toString() {
        return  "nome=" + nome + ", idade=" + idade;
    }
  
  
}
