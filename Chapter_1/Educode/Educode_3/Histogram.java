import java.util.Scanner;


public class Histogram {
    //Funktion zum zählen in welchem Bereich die eingabe zahl liegt
    public static int areaRange(int max, int min, int n, int zahl){
        int areas = (max - min) / n ; // Bereich einteilen
        int area = 0; 

        for (int i = 0; i < n; i++){
            if (zahl < (min + (i+1)*areas)){
                area = i;
                return area;
            } else if ( zahl == max){
                area = areas;
            }
        }
        return area;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if (args.length < 3){
            System.out.println("ERROR");
            return;
        }

        //Argumente aus Konsole einlesen
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int n   = Integer.parseInt(args[2]);
        
        //Fehlermeldung 1
        if (((min - max) % n != 0) || (min >= max) || (min < 0) || (max < 0) || (n<0)){
            System.out.println("ERROR");
            return;
        }

        int [] result = new int [n];

        while (scanner.hasNext() == true){
            // aktuelle Zahl einlesen
            int current = scanner.nextInt();

            //Fehlermeldung 2
            if ((current < min) || (current > max) || (current < 0)){
                System.out.println("ERROR");
                return;
            } else {
                result[areaRange(max, min, n, current)] += 1;
            }
        }

        //Ausgabe der Ergebnisse
        for (int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }
    }

}
