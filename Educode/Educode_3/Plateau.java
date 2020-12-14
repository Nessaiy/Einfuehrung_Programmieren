public class Plateau {
    /*
        > java Plateau 3 5
        ERROR: Bitte mindestens 3 Zahlen übergeben!
        > java Plateau 2 3 3 1 2 2 2 1
        4 3
        > java Plateau 2 3 3 3 1 2 2 2 1
        1 3
        > java Plateau 1 2 3 4 3 2 1
        3 1
        > java Plateau 1 2 3
        Kein Plateau
    */
    public static void main(String[] args){
        //Abbruch
        if (args.length < 3){
            System.out.println("ERROR");
            return;
        }

        int[] A = new int[args.length];
        for (int z = 0; z < args.length; z++ ) {
            A[z] = Integer.parseInt(args[z]);
        }

        //Startwerte
        int curStart = -1;
        int curLength = 0; 
        int maxStart = -1; 
        int maxLength = 0; 


        for (int z = 0; z< A.length - 1; z++) {
            if (A[z] < A[z+1]) {
                curStart = z + 1;
                curLength = 1;
            }

            if (A[z] == A[z+1]) {
                curLength++;
            }

            if (A[z] > A[z+1]) {
                if (curLength > maxLength) {
                    maxLength = curLength;
                    maxStart = curStart;
                }
            }


        }
        if (maxStart != -1){ 
            System.out.println(maxStart + " " + maxLength);
        } else {
            System.out.println("Kein Plateau");
        }

    }//main
}//class
