import java.util.Scanner;

public class Exam {
    public static void main(String[] args){
        /*
        $ cat input.txt
        fisch100
        75
        pasta107
        49
        kefir102
        60
        robot101
        42
        $ java Exam 120 < input.txt
        Student,Zulassung
        fisch100,Ja
        pasta107,Nein
        kefir102,Ja
        robot101,Nein
        */
    
        int Anzahl = (args.length - 1)/2;
        String Liste[][];
        Liste = new String[Anzahl][2];


        int maxPunktzahl = Integer.parseInt(args[0]);

        int z = 0;

        //Namen und Punktzahl eintragen
        for (int i = 0; i < Anzahl; i++){
            for (int j = 0; j < 2; j++){
                Liste[i][j] = args[1+z];
                z++;
            }
        }

        String Einlesen[];
        for (int i = 0; i < 3; i++){
            while(scanner.hasNext()==true) {
                String text = scanner.next();
                Einlesen[i] = text;
            }
        }

        //bestanden überprüfen und eintragen
        for (int i = 0; i < Anzahl; i++){
            if (Integer.parseInt(Liste[i][1]) > (0.5 * maxPunktzahl)) {
                Liste[i][1] = "Ja";
            } else {
                Liste[i][1] = "Nein";
            }
        }

        //Ausgabe
        System.out.println("Student,Zulassung");

        for (int i = 0; i< Anzahl; i++){
            for (int j = 0; j< 2; j++){
                System.out.print(Liste[i][j]);
                if ( j < 1) System.out.print(",");
            }
            System.out.println();
        }
    }
}
