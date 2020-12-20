//package de.hhu.edu;
import java.util.*; 

public class Skytale {


    private static char[][] readSecret(String nachricht, int n, int m){
        /*
        Schreiben Sie eine Methode private static char[][] readSecret(String nachricht, int n, int m), 
        welche die geheime Nachricht als String sowie zwei int-Werte für die Anzahl der Zeilen und Spalten 
        als Parameter übergeben bekommt und als ein zweidimensionales char[][]-Array mit $n$ Zeilen und 
        $m$ Spalten zurückgibt. Im obigen Beispiel stünde am Index [1][6] ein „O“, am Index [0][0] ein „W“ usw.
        */

        //String nachricht;  aus input soll verschlüsselt werden
        //int Spaltenzahl  = m;
        //int zeilenZahl = n;

        char[][] readSecret = new char[n][m];   //Array mit n Zeilen und m Spalten

        //Einlesen
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if ( (i*j + j) < (n * m) ){
                    readSecret[i][j] = nachricht.charAt(i*m + j);
                } else {
                    readSecret[i][j] = ' ';
                }
            }
        }

        //Rückgabe
        return readSecret;
    }

    private static String encrypt(char[][] secret){
        /*
        Schreiben Sie eine Methode private static String encrypt(char[][] secret), welche die geheime Nachricht 
        als zweidimensionales char[][]-Array entgegennimmt, die Nachricht verschlüsselt und die verschlüsselte 
        Nachricht wiederum als String zurückgibt.
        */

        int zeilen = secret[0].length;
        int spalten = secret.length;

        String encrypt = "";

        for (int i = 0; i < zeilen; i++){
            for (int j = 0; j < spalten; j++){
                encrypt = encrypt + secret[j][i];
            }
        }

        return encrypt;
    }


    private static String decrypt(char[][] encryptedSecret){
    /*
    Schreiben Sie eine weitere Methode private static String decrypt(char[][] encryptedSecret), die ein char[][] 
    entgegennimmt, die Nachricht entschlüsselt und die entschlüsselte Nachricht wiederum als String zurückgibt.
    */

        int zeilen = encryptedSecret[0].length;
        int spalten = encryptedSecret.length;

        String decrypt = "";

        for (int i = 0; i < zeilen; i++){
            for (int j = 0; j < spalten; j++){
                decrypt = decrypt + encryptedSecret[j][i];
            }
        }

        return decrypt;
    }


    public static void main(String[] args){
        int zeilen = 4; //n
        int spalten = 7; //m
        
        //Variante -E oder -D

        if ( args.length != 2) { //Überprüfung nicht Befehl + Text eingegeben

            System.out.println("ERROR");

        } else if (args[1].length() > zeilen * spalten ){ //Überprüfung ob Text zu lang

            System.out.println("ERROR");

        } else if (args[0].equals("-D")){

            //Eingabe einlesen
            String nachricht = args[1];

            //Leerzeichen anhängen
            while (nachricht.length() < (zeilen * spalten)) { 
                nachricht += " "; 
            } 

            //char entschlüsseln
            char[][] verschluesseltA = readSecret(nachricht, spalten, zeilen);
            String entschluesselt = decrypt(verschluesseltA);

            System.out.println(entschluesselt);

        } else if(args[0].equals("-E")){

            //Eingabe einlesen
            String nachricht = args[1];

            //Leerzeichen anhängen
            while (nachricht.length() < (zeilen * spalten)) { 
                nachricht += " "; 
            } 

            //char secret verschlüsseln
            char[][] secret = readSecret(nachricht, zeilen, spalten);
            String verschluesselt = encrypt(secret);

            System.out.println(verschluesselt);

        } else {

            System.out.println("ERROR");
        }
    }
}

