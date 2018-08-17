/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Mr Matsinhe
 *  esta classe  para amigos 
 */
public class Amigo extends Pessoa {
    private  String data;
   
    // inicializacao nesse metodo
    public Amigo() {
        super("indefinido", 0);
        this.data = " DD/MM/AAA";
    }
// Metodo de acesso para data de nascimento
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    

    public Amigo(String data) {
        this.data = data;
    }
    
    public String data(){
        return " DD/MM/AAA";
    }

    @Override
    public String toString() {
        return super.toString() + "data=" + data;
    }
    
}
