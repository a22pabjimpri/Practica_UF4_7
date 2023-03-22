package practica7;

import utils.Utils;
import java.util.Scanner;

/**
 *
 * @author Pablo Jiménez
 */
public class Practica7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numEstudiants = Utils.LlegirInt("Quants estudiats vols? ");
        Estudiant[] estudiants = new Estudiant[numEstudiants];

        System.out.println("Omple les dades del tutor");
        System.out.print("Introdueix el seu nom: ");
        String nom = scan.nextLine();
        System.out.print("Introdueix el seu cognom: ");
        String cognom = scan.nextLine();
        System.out.print("Introdueix la seva formacio: ");
        String formacio = scan.nextLine();

        Professor tutor = new Professor(nom, cognom, formacio);

        System.out.println("Omple les dades dels alumnes");
        for (int i = 0; i < numEstudiants; i++) {
            System.out.print("DNI: ");
            String dni = scan.nextLine();
            System.out.print("Nom: ");
            nom = scan.nextLine();
            System.out.print("cognom: ");
            cognom = scan.nextLine();
            int notaFinal = Utils.LlegirInt("Nota final: ");

            estudiants[i] = new Estudiant(dni, nom, cognom, notaFinal);

        }
        
        Grup gr = new Grup("1 DAM", estudiants, tutor);

        System.out.println(gr.toString());

        
        System.out.println("Nombre d'estudiants aprovats: " + gr.numAprovats());

        // Imprimir la llista d'estudiants aprovats
        Estudiant[] estudiantsAprovats = gr.estudiantsAprovats();
        System.out.println("Llista d'estudiants aprovats:");
        for (int i = 0; i<estudiantsAprovats.length; i++) {
            System.out.println(estudiantsAprovats[i]);
        }

    }

}
