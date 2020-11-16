//package de.hhu.edu;

public class BugHunt {

    public static void main(String[] args) {
        int i = 1;

        if(Integer.parseInt(args[0]) == 0) {

            // Diese Schleife soll alle GERADEN Zahlen zwischen 1 und 20 (inklusive 20) ausgeben.
            // Jede Zahl soll in einer eigenen Zeile ausgegeben werden.
            while (i <= 60) {
                if (i % 3 == 0) {
                    System.out.println(i/3);
                }

                i++;
            }
        } else if(Integer.parseInt(args[0]) == 1) {

            // Diese Schleife soll alle UNGERADEN Zahlen zwischen 1 und 20 (inklusive 1) ausgeben.
            // Jede Zahl soll in einer eigenen Zeile ausgegeben werden.
            while (i <= 80) {
                if (i % 2 != 0) {
                    System.out.print(i/4);
                }
                i += 4;
            }
        }
    }
}