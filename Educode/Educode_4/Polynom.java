//package de.hhu.edu;

import java.util.Scanner; 

public class Polynom {
    public static void main(String[] args){

        //Kontrolle richtige Anzahl
        if (args.length != 4){
            System.out.println("ERROR");
            System.exit(0);
        }

        //Variablen
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);

        double f;

        double x;
        String line;


        try (Scanner input = new Scanner(System.in)) {

                while (!(line = input.nextLine()).isEmpty()) {
                    x = Double.parseDouble(line);
                    f = a * x * x * x + b * x * x + c * x + d;
                    System.out.println("f(" + x + ")=" + a + "*" + x + "^3+" + b + "*" + x + "^2+" + c + "*" + x +"^1" +"+"+ d + "=" + f);
                }
        }

        if (line.isEmpty()){
            System.out.println("No line found");
        } else {
            System.out.println("ERROR");
        }

    }//main
}//class
