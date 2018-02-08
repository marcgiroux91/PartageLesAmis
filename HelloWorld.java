package PartageLesAmis;
import java.util.*;    
import java.io.*;  

public class HelloWorld {

    public static void main(String[] args) { 
        //voici une version du portable via netbeam
        // voici les informations que j'ajouter sur l'autre branche 
        Biblio.lireFichier("src/PartageLesAmis/biblio.txt"); 
        try { 
            BufferedReader br = new BufferedReader(new FileReader("src/PartageLesAmis/biblio.txt"));
            String line = br.readLine();                
            while (line != null) {
                System.out.println(line);                    
                line = br.readLine();
            }                
            br.close();       
        } catch (Exception ex ) {
            System.out.println("Problème d'ouverture du fichier" + "biblio.txt" );
        } 
        int nombre1, nombre2, prendrechoix; 
        int operation1, operation2, operation3, operation4;
        Scanner clavier = new Scanner(System.in);        

        menu(); // appel de la fonction qui affiche le menu
        System.out.println();
        prendrechoix = choixmenu();//mémorise le choix qui sera utilise dans le switch pour la bonne opération
        do{              
            System.out.println("Entrer le premier nombre :");
            nombre1 = clavier.nextInt();
            System.out.println();
            System.out.println("Entrer le deuxième nombre :");
            nombre2 = clavier.nextInt();              
            switch (prendrechoix){
                case 1 : 
                    operation1 = addition(nombre1,nombre2);
                    System.out.println("Voici la somme de la fonction «addition» : " + operation1);
                    break;
                case 2 : operation2 = soustraction(nombre1,nombre2);
                    System.out.println("Voici la soustraction de la fonction «soustraction» : " + operation2);
                    break;
                case 3 : operation3 = multiplication(nombre1,nombre2);
                    System.out.println("Voici la multiplication de la fonction «multiplication» : " + operation3);
                    break;
                case 4 : operation4 = division(nombre1,nombre2);
                    System.out.println("Voici la division de la fonction «division» : " + operation4);
                    break;                
            }             
            prendrechoix = choixmenu();
        } while (prendrechoix !=0); 

        System.out.println("Le programme s'arrête abruttement");
        System.exit(0);  
    }
    public static int addition (int nombre1, int nombre2){
        return nombre1 + nombre2;    
    }    
    //la valeure Return peut seulement retourner une seule valeur à la fonction main(principale) 
    public static int soustraction (int a, int b){
        return a - b;
    }

    public static int multiplication (int a, int b){
        return a * b;
    }

    public static int division (int a, int b){
        return a / b;
    }

    public static void menu (){
        System.out.println("Bienvenue aux opérations arithmétique");
        System.out.println("1 : addition");
        System.out.println("2 : soustraction");
        System.out.println("3 : multiplication");
        System.out.println("4 : division");
        System.out.println("0 : Quitter");
    }

    public static int choixmenu(){
        int choix;
        Scanner clavier = new Scanner(System.in);
        do{
            System.out.println("Entrer votre l'opération mathématique demandée !");
            choix = clavier.nextInt();
        } while ((choix < 0 || (choix > 4)));
        return choix;
    }
}
