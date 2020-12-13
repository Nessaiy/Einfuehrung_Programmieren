import java.lang.Math.*;

public class Kosinus {

    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        double cos = 0;
        double sum = 0;

        double[] fakultaet = new double [20];
        fakultaet[0] = 1;
        //2n! berechnen
        for (int i = 0; i< 19; i++){
            fakultaet[i+1] = fakultaet[i] * (i+1);
        }

        for (int i = 0; i < 20 ; i++){
            System.out.println(fakultaet[i]);
        }

        
        for (int i = 1; i < 20 ; i++){

            cos = cos + ( Math.pow(-1.0, i) / (2*fakultaet[i]) * Math.pow(x, 2*i));
        }
        System.out.println(cos);   
    }
}
