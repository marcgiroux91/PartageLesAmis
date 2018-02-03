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

    }
}
