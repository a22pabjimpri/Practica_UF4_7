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

        int numEstudiants = Utils.LlegirInt("Quants estudiats vols?");
        Estudiant[] estudiants = new Estudiant[numEstudiants];

        System.out.println("Omple les dades del tutor");
        System.out.println("Introdueix el seu nom: ");
        String nom = scan.nextLine();
        System.out.println("Introdueix el seu cognom: ");
        String cognom = scan.nextLine();
        System.out.println("Introdueix la seva formacio: ");
        String formacio = scan.nextLine();

        Professor tutor = new Professor(nom, cognom, formacio);

        for (int i = 0; i < numEstudiants; i++) {
            System.out.println("DNI: ");
            String dni = scan.nextLine();
            System.out.println("Nom: ");
            nom = scan.nextLine();
            System.out.println("cognom: ");
            cognom = scan.nextLine();
            int notaFinal = Utils.LlegirInt("Nota final: ");

            estudiants[i] = new Estudiant(dni, nom, cognom, notaFinal);

        }

        System.out.println("Grup:");
        System.out.println(Grup.toString(estudiants));

        int numAprovats = Grup.numAprovats(estudiants);
        System.out.println("Nombre d'estudiants aprovats: " + numAprovats);

        // Imprimir la llista d'estudiants aprovats
        Estudiant[] estudiantsAprovats = Grup.estudiantsAprovats(estudiants);
        System.out.println("Llista d'estudiants aprovats:");
        for (int i = 0; i<estudiants.length; i++) {
            System.out.println(estudiants[i]);
        }

    }

}
