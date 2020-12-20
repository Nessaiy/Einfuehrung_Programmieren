//package de.hhu.edu;

public class DNA {

    private static String complementWC(String dnaWC) {

        String wcComplement = "";
        char[] array = new char[dnaWC.length()];

        for(int i=0; i<dnaWC.length(); i++) {
            array[i] = dnaWC.charAt(i);
        }

        int laenge = array.length;
        for(int i=0; i<laenge; i++) {
            if (array[i] == 'A') {
                array[i] = 'T';
                wcComplement = wcComplement + array[i];
            } else if (array[i] == 'T') {
                array[i] = 'A';
                wcComplement = wcComplement + array[i];
            } else if (array[i] == 'C') {
                array[i] = 'G';
                wcComplement = wcComplement + array[i];
            } else if (array[i] == 'G') {
                array[i] = 'C';
                wcComplement = wcComplement + array[i];
            } else  return "ERROR: es handelt sich nicht um ein DNA!";
        }
        return wcComplement;
    }//complementWC

    private static boolean palindromeWC(String dnaWC) {

        int sumA = 0;
        int sumT = 0;
        int sumG = 0;
        int sumC = 0;
        int sumA2 = 0;
        int sumT2 = 0;
        int sumG2 = 0;
        int sumC2 = 0;  

        String newDna = complementWC(dnaWC);

        for(int i=0; i<dnaWC.length(); i++) {
            if (dnaWC.charAt(i) == 'A') {
                sumA = sumA + 1;
            } else if (dnaWC.charAt(i) == 'T') {
                sumT = sumT + 1;
            } else if (dnaWC.charAt(i) == 'G') {
                sumG = sumG + 1;
            } else if (dnaWC.charAt(i) == 'C') {
                sumC = sumC + 1;
            }
        }

        for(int i=0; i<newDna.length(); i++) {
            if (newDna.charAt(i) == 'A'){
                sumA2 = sumA2 + 1;
            } else if (newDna.charAt(i) == 'T'){
                sumT2 = sumT2 + 1;  
            } else if (newDna.charAt(i) == 'G'){
                sumG2 = sumG2 + 1;
            } else if (newDna.charAt(i) == 'C'){
                sumC2 = sumC2 + 1;
            }
        }

        if ( (sumA == sumA2) && (sumT == sumT2) && (sumG == sumG2) && (sumC == sumC2) ) {
            return true;
        } else {
            return false;
        }
    }//palindromeWC
    
    public static void main(String[] args) {

        boolean test = true;
        String dnaWC = args[0];

        //Überprüfung ob nur DNA Buchstaben benutzt sind.
        for(int i=0; i<dnaWC.length(); i++) {
            if (dnaWC.charAt(i) != 'T' && dnaWC.charAt(i) != 'A' && dnaWC.charAt(i) != 'G' && dnaWC.charAt(i) != 'C'  ) {
                test = false;
            } 
        }

        if (test) {
            System.out.println(complementWC(dnaWC));
            System.out.println(palindromeWC(dnaWC));
        } else {
            System.out.println("ERROR: das gegebene Wort ist kein DNA!");
        }

    }//main
}//class
