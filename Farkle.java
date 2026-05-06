/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//package moewenfels.farkle;

/**
 *
 * @author Marcus Noerren aka Moewenfels
 */

import java.util.* ;

public class Farkle {
    
    

// Globale Variabeln / Arrays
    
    public static int[] WuerfelErgebnis = new int [6]; 
    
    public static String ergebnis = "";
    
    public static int count1 = 0;
    public static int count2 = 0;
    public static int count3 = 0;
    public static int count4 = 0;
    public static int count5 = 0;
    public static int count6 = 0;
    
    public static int count1A = 0;
    public static int count2A = 0;
    public static int count3A = 0;
    public static int count4A = 0;
    public static int count5A = 0;
    public static int count6A = 0;
    
    public static int potsum = 0;
    
    public static String auswahl = "";
    
    public static String gewurfelteZiffern = "";
    
    public static int tempPunkte = 0;
    
    public static String WuerfelZaehlenErgebnis = "";
    public static String AuswahlZaehlenAuswahl = "";
    
    public static boolean auswahlLegitim = false;
    
            // Game States
    public static boolean gameStatePunkteGewaehlt = false;
    public static boolean gameStateNaechsterSpieler = false;
    public static boolean gameStateNeuesSpiel = false;
    
            // Würzelanzahl
    public static int wuerfelAnzahl = 6;
    
// Methoden
    
    // Auswürfeln der 6 Würfel
    
    private static void Auswuerfeln(){
        
        for (int i = 0; i < 6; i++) {
            WuerfelErgebnis[i] = 0;
        }
        
        for (int i = 0; i < wuerfelAnzahl; i++) {
            
            WuerfelErgebnis[i] = (int) ((Math.random()*6)+1);
            //System.out.println("Wuerfelergebnis: "+we[i]);                                //debugging
            //System.out.println("");
        }
    }
        
    // Zählen der Würfelergebnisse
    
    private static void WuerfelZaehlen(){
        
        WuerfelZaehlenErgebnis = "";        

        for (int i = 0; i < 6; i++) {
            
            WuerfelZaehlenErgebnis = WuerfelZaehlenErgebnis + WuerfelErgebnis[i];
        }
        
        //System.out.println(ergebnis);                                                      //debugging

        
        //System.out.println("Character Occurrences:");                                 //debugging

        count1 =0;
        count2 =0;
        count3 =0;
        count4 =0;
        count5 =0;
        count6 =0;
         

            for (int i = 0; i < WuerfelZaehlenErgebnis.length(); i++) {         
                // String auf Anzahl der Zahlen von 1-6 prüfen
            switch (WuerfelZaehlenErgebnis.charAt(i)) {
                case '1' -> count1++;
                case '2' -> count2++;
                case '3' -> count3++;
                case '4' -> count4++;
                case '5' -> count5++;
                case '6' -> count6++;
                default -> {
                }
            }


        }
        System.out.println("Anzahl gewuerfelter Ziffern:");         // Übersicht der Ergebnisse ausgeben
        System.out.println("1\t2\t3\t4\t5\t6");
        System.out.print(count1+"\t");
        System.out.print(count2+"\t");
        System.out.print(count3+"\t");
        System.out.print(count4+"\t");
        System.out.print(count5+"\t");
        System.out.print(count6+"\t");
        System.out.println("");
        
    }
    
    // Überprüfen der potenziellen Punkte
    
    private static void PunktePruefen(){
            
    potsum = 0;
        
        switch (count1) {         // Punktemöglichkeiten abfragen, um zu wissen, ob der Spieler überhaupt punkten kann
            case 1 -> potsum = potsum + 100;
            case 2 -> potsum = potsum + 200;
            case 3 -> potsum = potsum + 1000;
            case 4 -> potsum = potsum + 2000;
            case 5 -> potsum = potsum + 3000;
             case 6 -> potsum = potsum + 4000;
            }
        // Punktemöglichkeiten abfragen, um zu wissen, ob der Spieler überhaupt punkten kann
        
        
        switch (count2) {
            case 1 -> potsum = potsum + 0;
            case 2 -> potsum = potsum + 0;
            case 3 -> potsum = potsum + 200;
            case 4 -> potsum = potsum + 400;
            case 5 -> potsum = potsum + 800;
             case 6 -> potsum = potsum + 1600;
            }
        
        switch (count3) {
            case 1 -> potsum = potsum + 0;
            case 2 -> potsum = potsum + 0;
            case 3 -> potsum = potsum + 300;
            case 4 -> potsum = potsum + 600;
            case 5 -> potsum = potsum + 1200;
             case 6 -> potsum = potsum + 2400;
            }
        
        switch (count4) {
            case 1 -> potsum = potsum + 0;
            case 2 -> potsum = potsum + 0;
            case 3 -> potsum = potsum + 400;
            case 4 -> potsum = potsum + 800;
            case 5 -> potsum = potsum + 1600;
             case 6 -> potsum = potsum + 3200;
            }
                
        switch (count5) {
            case 1 -> potsum = potsum + 50;
            case 2 -> potsum = potsum + 100;
            case 3 -> potsum = potsum + 500;
            case 4 -> potsum = potsum + 1000;
            case 5 -> potsum = potsum + 2000;
             case 6 -> potsum = potsum + 4000;
            }
        
        
        switch (count6) {
            case 1 -> potsum = potsum + 0;
            case 2 -> potsum = potsum + 0;
            case 3 -> potsum = potsum + 600;
            case 4 -> potsum = potsum + 1200;
            case 5 -> potsum = potsum + 2400;
             case 6 -> potsum = potsum + 4800;
            }
        
        if (count1 == 1 && count2 == 1 && count3 == 1 && count4 == 1 && count5 == 1 && count6 ==1) {
            potsum = potsum + 1500;
        } else
        
        
        if (count2 == 1 && count3 == 1 && count4 == 1 && count5 == 1 && count6 == 1) {
            potsum = potsum + 750;
        } else
        
        
        if (count1 == 1 && count2 == 1 && count3 == 1 && count4 == 1 && count5 == 1 ) {
            potsum = potsum + 500;
        }
            
            //System.out.println("Potenzielle Punktezahl: "+potsum);                             // debugging
    }
    
        // Zählen der Würfelergebnisse
    
    private static void AuswahlZaehlen(){
        
        AuswahlZaehlenAuswahl = auswahl;        

        /*
        for (int i = 0; i < 6; i++) {
            
            AuswahlZaehlenAuswahl = AuswahlZaehlenAuswahl + WuerfelErgebnis[i];
        }
        */
        
        //System.out.println(AuswahlZaehlenAuswahl);                                                     //debugging

        
        //System.out.println("Character Occurrences:");                                     //debugging

        count1A =0;
        count2A =0;
        count3A =0;
        count4A =0;
        count5A =0;
        count6A =0;
         

            for (int i = 0; i < AuswahlZaehlenAuswahl.length(); i++) {         
                // String auf Anzahl der Zahlen von 1-6 prüfen
            switch (AuswahlZaehlenAuswahl.charAt(i)) {
                case '1' -> count1A++;
                case '2' -> count2A++;
                case '3' -> count3A++;
                case '4' -> count4A++;
                case '5' -> count5A++;
                case '6' -> count6A++;
                default -> {
                }
            }


        }
            
        if (auswahlLegitim == true) {
           
        System.out.println("Anzahl ausgewaehlter Ziffern:");         // Übersicht der Ergebnisse ausgeben
        System.out.println("1\t2\t3\t4\t5\t6");
        System.out.print(count1A+"\t");
        System.out.print(count2A+"\t");
        System.out.print(count3A+"\t");
        System.out.print(count4A+"\t");
        System.out.print(count5A+"\t");
        System.out.print(count6A+"\t");
        System.out.println("");
        
        //System.out.println("Variable - WuerfelZaehlenErgebnis"+WuerfelZaehlenErgebnis);                                // Debugging
        //System.out.println("Variable - AuswahlZaehlenAuswahl: "+AuswahlZaehlenAuswahl);                                             // Debugging
        
        }
        
        if (count1A > count1 ||
            count2A > count2 ||
            count3A > count3 ||
            count4A > count4 ||
            count5A > count5 ||
            count6A > count6 ) {

            auswahlLegitim = false;
            
            //wuerfelAnzahl = wuerfelAnzahl + 1;                                                // unnötig?
  
        } else {
        
            auswahlLegitim = true;
        
        }
        
        //System.out.println("Variable - auswahlLegitim: "+auswahlLegitim);                                         // debugging
        
    }
    
    // Überprüfen der Spieler-Auswahl
    
    private static void AuswahlPruefen(){
            
    potsum = 0;
        
        switch (count1A) {         // Punktemöglichkeiten abfragen, um zu wissen, ob der Spieler überhaupt punkten kann
            case 1 -> potsum = potsum + 100;
            case 2 -> potsum = potsum + 200;
            case 3 -> potsum = potsum + 1000;
            case 4 -> potsum = potsum + 2000;
            case 5 -> potsum = potsum + 3000;
             case 6 -> potsum = potsum + 4000;
            }
        // Punktemöglichkeiten abfragen, um zu wissen, ob der Spieler überhaupt punkten kann
        
        
        switch (count2A) {
            case 1 -> potsum = potsum + 0;
            case 2 -> potsum = potsum + 0;
            case 3 -> potsum = potsum + 200;
            case 4 -> potsum = potsum + 400;
            case 5 -> potsum = potsum + 800;
             case 6 -> potsum = potsum + 1600;
            }
        
        switch (count3A) {
            case 1 -> potsum = potsum + 0;
            case 2 -> potsum = potsum + 0;
            case 3 -> potsum = potsum + 300;
            case 4 -> potsum = potsum + 600;
            case 5 -> potsum = potsum + 1200;
             case 6 -> potsum = potsum + 2400;
            }
        
        switch (count4A) {
            case 1 -> potsum = potsum + 0;
            case 2 -> potsum = potsum + 0;
            case 3 -> potsum = potsum + 400;
            case 4 -> potsum = potsum + 800;
            case 5 -> potsum = potsum + 1600;
             case 6 -> potsum = potsum + 3200;
            }
                
        switch (count5A) {
            case 1 -> potsum = potsum + 50;
            case 2 -> potsum = potsum + 100;
            case 3 -> potsum = potsum + 500;
            case 4 -> potsum = potsum + 1000;
            case 5 -> potsum = potsum + 2000;
             case 6 -> potsum = potsum + 4000;
            }
        
        
        switch (count6A) {
            case 1 -> potsum = potsum + 0;
            case 2 -> potsum = potsum + 0;
            case 3 -> potsum = potsum + 600;
            case 4 -> potsum = potsum + 1200;
            case 5 -> potsum = potsum + 2400;
             case 6 -> potsum = potsum + 4800;
            }
        
        if (count1A == 1 && count2A == 1 && count3A == 1 && count4A == 1 && count5A == 1 && count6A ==1) {
            potsum = potsum + 1500;
        } else
        
        
        if (count2A == 1 && count3A == 1 && count4A == 1 && count5A == 1 && count6A == 1) {
            potsum = potsum + 750;
        } else
        
        
        if (count1A == 1 && count2A == 1 && count3A == 1 && count4A == 1 && count5A == 1 ) {
            potsum = potsum + 500;
        }
            tempPunkte = tempPunkte + potsum;
        
            System.out.println("Gewaehlte Punktezahl: "+potsum);                             // debugging

    }
    
    
    
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        
// Definitionen der Variablen
    
        // Spieler Anzahl
        int spielerAnzahl = 4;
            
        // Array SpielerNummer
        int SpielerNummer[] = new int[4];                   // ungenutzt?
        
        // Array SpielerName
        String SpielerName[] = new String[4];
        
        // Array SpielerPunkte
        int SpielerPunkte[] = new int[4];
        
        // Spieler Zähler
        int Z = 0;
        
        // Zielpunktzahl
        int zielpunktzahl = 10000;
        
        // Rundenzahl
        int rz = 0;
        
        // Wurfzahl
        int wz = 0;
        
        // jaein - Ja / Nein Angabe als Char
        char jaein = '0';
        
        


// Vorbereitung
        
        // Auswahl Spieleranzahl
        
        for (int i = 0; i < spielerAnzahl; i++) {

            System.out.print("Eingabe Spieleranzahl (2-4): ");
            spielerAnzahl = s1.nextInt();
            //System.out.println(spielerAnzahl);                                                    // Debugging

            if (spielerAnzahl == 2) {
                SpielerNummer[2] = 99;
                SpielerName[2] = "leergelassen";
                SpielerNummer[3] = 99;
                SpielerName[3] = "leergelassen";
                i=4;
            } else if (spielerAnzahl == 3) {
                SpielerNummer[3] = 99;
                SpielerName[3] = "leergelassen";
                i=4;
            } else if (spielerAnzahl == 4){
                i=4;
            } else {i=0;}
        }
        
        // Eingabe Spielername
        
        for (int i = 0; i < spielerAnzahl; i++) {
            
            System.out.print("Spielername fuer Nr."+(i+1)+" eingeben: ");
            SpielerName[i] = s1.next();
        }
        
        // Eingabe Zielpunktzahl
        
        System.out.println("Zielpunktzahl eingeben (z.B. 10000): "); 
        zielpunktzahl = s1.nextInt();
        
        
        
// DIE Schleife
        
        while (true) {
            if (gameStateNeuesSpiel == true) {
                rz=0;
                
                for (int i = 0; i < spielerAnzahl; i++) {
                    SpielerPunkte[i] = 0;

                }
            }
            if (gameStateNaechsterSpieler == true) {
                wz = 0;
                
                if (Z == (spielerAnzahl-1)) {
                    Z = 0;
                    rz++;
                } else {
                    Z = Z+1;
                    }
                wuerfelAnzahl = 6;
                tempPunkte =0;
            }
            
            System.out.println("_____________");
            System.out.println(SpielerName[Z]+" ist dran. Wurf "+(wz+1)+" Runde "+(rz+1));
           
            Auswuerfeln();
            
            WuerfelZaehlen();
            
            PunktePruefen();
            
            
            
            
            gameStatePunkteGewaehlt = false;
            gameStateNaechsterSpieler = false;
            
            while (true) {
                
                if (gameStatePunkteGewaehlt == true | gameStateNaechsterSpieler == true | gameStateNeuesSpiel == true) {
                        //System.out.println("gameStatePunkteGewaehlt = "+gameStatePunkteGewaehlt);                                   //debugging
                        //System.out.println("gameStatePunkteGewaehlt = "+gameStateNaechsterSpieler);                                   //debugging
                        break;
                    }
                
                if (potsum == 0) {
                
                    System.out.println("Leider keine Punkte moeglich!");
                    System.out.println("_____________________");
                    System.out.println(" - - - - - - - - - - ");
                    System.out.println("_____________________");
                    gameStateNaechsterSpieler = true;
                    break;
                    
                } else {
                    
                    
                   
                    System.out.print("Am Stueck eingeben welche Zahlen punkten (ohne Leerzeichen): ");
                    auswahl = s1.next();
                    System.out.println("");

                    while (true) {
                        
                        if (gameStateNeuesSpiel == true) {
                            break;
                        }
                        
                        
                        AuswahlZaehlen();

                        if (auswahlLegitim == false) {
                            gameStatePunkteGewaehlt = false;
                            break;
                        }

                        AuswahlPruefen();


                        System.out.println("Temporaere Punkte diese Runde: "+tempPunkte);
                        
                        
                        while (true) {
                            
                                                        
                            wuerfelAnzahl = wuerfelAnzahl - auswahl.length();
                            
                            if (wuerfelAnzahl == 0) {
                                    wuerfelAnzahl = 6;
                                }
                            
                            System.out.print("Mit "+wuerfelAnzahl+" weiterwuerfeln? j/n: ");
                            jaein =  s1.next().charAt(0);

                            if ( jaein == 'j' ) {

                                wz++;
                                break;

                            } else if (jaein == 'n' ) {
                                SpielerPunkte[Z]= SpielerPunkte[Z] + tempPunkte;
                                System.out.println(SpielerName[Z]+" hat momentan "+SpielerPunkte[Z]+" Punkte!");
                                if (SpielerPunkte[Z]>=zielpunktzahl) {
                                    System.out.println(SpielerName[Z]+" hat gewonnen! Mit "+SpielerPunkte[Z]+" / "+zielpunktzahl+" Punkten!");
                                    
                                    
                                    System.out.print("Neustarten? j/n: "); 
                                    jaein =  s1.next().charAt(0);
                                    
                                    if (jaein == 'n') {
                                        System.exit(0);
                                    } else if (jaein == 'j') {
                                        gameStateNeuesSpiel = true;
                                    }
                                }
                                wuerfelAnzahl = 6;
                                gameStateNaechsterSpieler = true;
                                break;
                            }
                        
                        
                        }
                        
                        gameStatePunkteGewaehlt = true;
                        break;

                    } 
                
                
                
                
                
                
                
                
                
                
                
                }
            } 
            
            
            
            
            
            
            
        } 
        
        
    } 
} 
