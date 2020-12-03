//package de.hhu.edu;

public class FizzBuzz {

    public static void main(String[] args) {
        // Laufe in einer Schleife mit der Zählvariable i von 1 bis 100
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) { // Wenn i durch 3 und durch 5 teilbar ist, gebe 'FizzBuzz' aus
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // Wenn i durch 3 teilbar ist, gebe 'Fizz' aus
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // Wenn i durch 5 teilbar ist, gebe 'Buzz' aus
                System.out.println("Buzz");
            } else { // Wenn keiner der obigen Fälle eintritt, gebe i aus
                System.out.println(String.valueOf(i));
            }
        }
    }
}