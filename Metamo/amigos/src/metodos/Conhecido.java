/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Mr Matsinhe
 */
public class Conhecido extends Pessoa{
 private String email;

    public Conhecido() {
        super("indefinido", 0);
        this.email = "indefinidos";
    }
// Gets e set para acesso do email
    public Conhecido(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
   public String email(){
       return " indefinido";
   }

    @Override
    public String toString() {
        return super.toString() + "email=" + email;
    }
   
   
   
    }
