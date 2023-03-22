/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Pablo Jiménez
 */
public class Professor {
    private String nom, cognom, formacio;
    
    Professor(String nom, String cognom, String formacio){
        this.nom = nom;
        this.cognom = cognom;
        this.formacio = formacio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getFormacio() {
        return formacio;
    }

    public void setFormacio(String formacio) {
        this.formacio = formacio;
    }
    
    
}
