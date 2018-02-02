package PartageLesAmis;

import java.io.BufferedReader;
import java.io.FileReader;

public class Biblio {
    public static void lireFichier(String nom){
        try { 
                BufferedReader br = new BufferedReader(new FileReader(nom));
                
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
