//package de.hhu.edu;

import java.awt.Color;

public class MyColor extends Color{
    public double w, c, m, y, k;
    double debug;

    public static MyColor instance;

    public MyColor(int r, int g, int b){
        super(r, g, b);
        debug = Math.max(r, g);
        w = (Math.max(debug , b) / 255);
        c = (w - ((double)(r)/255))/w;
        m = (w - ((double)(g)/255))/w;
        y = (w - ((double)(b)/255))/w;
        k = 1 - w;
    }//MyColor 3

    public MyColor(double c, double m, double y, double k){
        super((int)(255 * (1-c) * (1-k)), (int) (255 * (1-m) * (1-k)), (int)(255 * (1-y) * (1-k)));

        //w = Math.max(Math.max((int)(255 * (1-c) * (1-k)), (int) (255 * (1-m) * (1-k))), (int)(255 * (1-y) * (1-k)));
        this.c = c;
        this.m = m;
        this.y = y;
        this.k = k;
    }//MyColor 4

    public double getC(){
        return c;
    }//getC

    public double getY(){
        return y;
    }//getY

    public double getM(){
        return m;
    }//getM

    public double getK(){
        return k;
    }//getK

    public static double r(double x){//Methode zum abschneiden der Nachkommastellen
        int a = (int)(x*100);
        double b = (double)(a);
        return b / 100;
    }//double r

    public static void main(String[] args){
        if(args.length == 3){//RGB
            instance = new MyColor(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));

            System.out.println("C: " + r(instance.getC()));
            System.out.println("M: " + r(instance.getM()));
            System.out.println("Y: " + r(instance.getY()));
            System.out.println("K: " + r(instance.getK()));
        }else if(args.length == 4){//CYMYK
            instance = new MyColor(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));

            System.out.println("R: " + (int)(255 * (1 - Double.parseDouble(args[0])) * (1 - Double.parseDouble(args[3])) ));
            System.out.println("G: " + (int)(255 * (1 - Double.parseDouble(args[1])) * (1 - Double.parseDouble(args[3])) ));
            System.out.println("B: " + (int)(255 * (1 - Double.parseDouble(args[2])) * (1 - Double.parseDouble(args[3])) ));
        }
    }
}