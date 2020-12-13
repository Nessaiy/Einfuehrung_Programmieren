public class Matrix {
    public static void main(String[] args){
        
        int l = args.length; //Länge Eingabe auslesen

        if (l >= 2){ //Eingabe weniger als 2 Argumente
            int Zeilen = Integer.parseInt(args[0]);     //Zeilen einlesen
            int Spalten = Integer.parseInt(args[1]);    //Spalten einlesen

            //Array definieren
            int[][] a;
            a = new int[Zeilen][Spalten];

            int z = 0;


            if (l - 2 == Zeilen * Spalten){
                //Array einlesen
                for (int i = 0; i< Zeilen;i++){
                    for (int j = 0; j< Spalten; j++){
                        a[i][j] = Integer.parseInt(args[2+z]);
                        z++;
                    }
                }



                //Array summieren
                int sum = 0;

                for (int i = 0; i< Zeilen; i++){
                    for (int j = 0; j< Spalten; j++){
                        sum = sum + a[i][j];
                    }
                }
                System.out.println(sum);

                //Array ausgeben
                for (int i = 0; i< Zeilen; i++){
                    for (int j = 0; j< Spalten; j++){
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }

            } else {
                System.out.println("ERROR");
            }
        } else System.out.println("ERROR");
    }
}