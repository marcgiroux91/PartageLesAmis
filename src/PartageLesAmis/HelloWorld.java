package PartageLesAmis;

import java.util.*;
import java.io.*;

public class HelloWorld {

    public static Scanner clavier = new Scanner(System.in);
    // on met la variable static dehors qu'on va pouvoir ré-utiliser dans toutes les fct static

    public static void main(String[] args) {
        //Biblio.lireFichier("src/PartageLesAmis/biblio.txt"); 
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/PartageLesAmis/biblio.txt"));
            String line = br.readLine();
            while (line != null) {
                //System.out.println(line);                    
                line = br.readLine();
            }
            br.close();
        } catch (Exception ex) {
            System.out.println("Problème d'ouverture du fichier" + "biblio.txt");
        }
        int nombre1, nombre2;
        String choixOperation;
        int operation; // pas nécessaire d'avoir 4 variables, on reprend la même lol      

        menu(); // 
        System.out.println();

        // on doit pouvoir sortir même au début donc un while et non un do/while
        boolean finDuProgramme = false;

        while (!finDuProgramme) {
            choixOperation = choixMenu();
            if (choixOperation.equals("Q")) {
                finDuProgramme = true;
            } else {
                System.out.println("Entrer le premier nombre :");
                nombre1 = clavier.nextInt();
                clavier.nextLine(); // vider le buffer juste au cas où
                System.out.println();
                System.out.println("Entrer le deuxième nombre :");
                nombre2 = clavier.nextInt();
                clavier.nextLine();
                switch (choixOperation) {
                    case "A":
                        operation = addition(nombre1, nombre2);
                        System.out.println("Voici la somme : " + operation);
                        break;
                    case "B":
                        operation = soustraction(nombre1, nombre2);
                        System.out.println("Voici la soustraction : " + operation);
                        break;
                    case "C":
                        operation = multiplication(nombre1, nombre2);
                        System.out.println("Voici la multiplication : " + operation);
                        break;
                    case "D":
                        operation = division(nombre1, nombre2);
                        System.out.println("Voici la division : " + operation);
                        break;
                }
            }
        }
        System.out.println ("L'utilisation de la calculatrice est terminées !");
    } 
    
    public static int addition(int nombre1, int nombre2) {
        return nombre1 + nombre2;
    }

    //la valeure Return peut seulement retourner une seule valeur Ã  la fonction main(principale) 
    public static int soustraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static void menu() {
        System.out.println("Bienvenue aux opÃ©rations arithmÃ©tique");
        System.out.println("A : addition");
        System.out.println("B : soustraction");
        System.out.println("C : multiplication");
        System.out.println("D : division");
        System.out.println("Q : Quitter");
    }

    public static String choixMenu() {
        String choix;
        Scanner clavier = new Scanner(System.in);
        do {
            System.out.println("Entrer votre l'opération mathématique demandée !");
            choix = clavier.next();
        } while (!choix.equals("A") && !choix.equals("B")
                && !choix.equals("C") && !choix.equals("D")
                && !choix.equals("Q"));
        return choix;
    }
}
