package PartageLesAmis;
import java.util.*;    
import java.io.*;  

public class HelloWorld {

    public static void main(String[] args) { 
        //voici une version du portable via netbeam
        // voici les informations que j'ajouter sur l'autre branche 
        // ligne patate poil jolie coeur
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
            System.out.println("ProblÃ¨me d'ouverture du fichier" + "biblio.txt" );
        } 
        int nombre1, nombre2;
        String prendrechoix; 
        int operation1, operation2, operation3, operation4;
        Scanner clavier = new Scanner(System.in);        

        menu(); // appel de la fonction qui affiche le menu
        System.out.println();
        prendrechoix = choixmenu();//mÃ©morise le choix qui sera utilise dans le switch pour la bonne opÃ©ration
        do{              
            System.out.println("Entrer le premier nombre :");
            nombre1 = clavier.nextInt();
            System.out.println();
            System.out.println("Entrer le deuxiÃ¨me nombre :");
            nombre2 = clavier.nextInt();              
            switch (prendrechoix){
                case "A" : 
                    operation1 = addition(nombre1,nombre2);
                    System.out.println("Voici la somme de la fonction Â«additionÂ» : " + operation1);
                    break;
                case "B" : operation2 = soustraction(nombre1,nombre2);
                    System.out.println("Voici la soustraction de la fonction Â«soustractionÂ» : " + operation2);
                    break;
                case "C" : operation3 = multiplication(nombre1,nombre2);
                    System.out.println("Voici la multiplication de la fonction Â«multiplicationÂ» : " + operation3);
                    break;
                case "D" : operation4 = division(nombre1,nombre2);
                    System.out.println("Voici la division de la fonction Â«divisionÂ» : " + operation4);
                    break;                
            }             
            prendrechoix = choixmenu();
        } while (!prendrechoix.equals("Q")); 

        System.out.println("Le programme s'arrÃªte abruttement");
        System.exit(0);  
    }
    public static int addition (int nombre1, int nombre2){
        return nombre1 + nombre2;    
    }    
    //la valeure Return peut seulement retourner une seule valeur Ã  la fonction main(principale) 
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
        System.out.println("Bienvenue aux opÃ©rations arithmÃ©tique");
        System.out.println("A : addition");
        System.out.println("B : soustraction");
        System.out.println("C : multiplication");
        System.out.println("D : division");
        System.out.println("Q : Quitter");
    }

    public static String choixmenu(){
        String choix;
        Scanner clavier = new Scanner(System.in);
        do{
            System.out.println("Entrer votre l'opÃ©ration mathÃ©matique demandÃ©e !");
            choix = clavier.next();
        } while ( !choix.equals("A") &&
                  !choix.equals("B") &&
                  !choix.equals("C") &&
                  !choix.equals("D") &&
                  !choix.equals("Q"));
        return choix;
    }
}