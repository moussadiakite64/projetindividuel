package defaultpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moussa.diakite
 */
public class Client {
    private String nom;
    private String login;
    private String password;

    public Client() {
    }

    public Client(String nom, String login, String password) {
        this.nom = nom;
        this.login = login;
        this.password = password;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void listClient(){
    }
     
}
