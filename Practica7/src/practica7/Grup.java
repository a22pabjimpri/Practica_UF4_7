/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Pablo Jiménez
 */
public class Grup {

    private String nom;
    private Estudiant[] estudiants;
    private Professor tutor;

    public Grup(String nom, Estudiant[] estudiants, Professor tutor) {
        this.nom = nom;
        this.estudiants = estudiants;
        this.tutor = tutor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grup: " + nom + "\n");
        sb.append("Tutor: " + tutor.toString() + "\n");
        sb.append("Estudiants:\n");
        for (int i = 0; i < estudiants.length; i++) {
            sb.append(estudiants[i].toString() + "\n");
        }
        return sb.toString();
    }

    public int numAprovats() {
        int numAprovats = 0;

        for (int i = 0; i < estudiants.length; i++) {
            if (estudiants[i].getNotaFinal() > 5) {
                numAprovats++;
            }
        }
        return numAprovats;
    }
    
    public Estudiant[] estudiantsAprovats() {
        int numAprovats = numAprovats();
        Estudiant[] aprovats = new Estudiant[numAprovats];
        int j = 0;
        for (int i = 0; i < estudiants.length; i++) {
            if (estudiants[i].getNotaFinal() >= 5) {
                aprovats[j] = estudiants[i];
                j++;
            }
        }
        return aprovats;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Estudiant[] getEstudiants() {
        return estudiants;
    }

    public void setEstudiants(Estudiant[] estudiants) {
        this.estudiants = estudiants;
    }

    public Professor getTutor() {
        return tutor;
    }

    public void setTutor(Professor tutor) {
        this.tutor = tutor;
    }

}
