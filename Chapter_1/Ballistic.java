//package de.hhu.edu;

public class Ballistic {

    public static void main(String[] args) {
        Double g = 9.81;    //g als Konstante eingeben
        Double x_0 = Double.parseDouble(args[0]); //x_0 einlesen
        Double v_0 = Double.parseDouble(args[1]); //v_0 einlesen
        Double t = Double.parseDouble(args[2]); //t einlesen
        
        Double s = x_0 + v_0 * t - (g*t*t)/2; //Ergebnis Strecke s berechnen

        System.out.println(s); //Ergebnis ausgeben
    }
}