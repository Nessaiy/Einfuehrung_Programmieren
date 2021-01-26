package de.hhu.edu;

import java.util.Scanner;
import java.util.zip.Checksum;
/*
Fletcher16 (data)
Input: Array data von 8-Bit-Integern
Output: 16-Bit-Prüfsumme zu data

sum1 := 0
sum2 := 0

for i := 0 to length (data) do
    sum1 := (sum1 + data[i]) modulo M
    sum2 := (sum2 + sum1) modulo M
endfor

checksum := sum1 gefolgt von sum2
return checksum 
*/

public class Fletcher16 implements Checksum {

    private static short combineValues(int value1, int value2) {
        return (short) ((value1 & 0x00ff) | ((value2 << 8) & 0xff00));
    }

    private int sum1{

    }//int sum1

    private int sum2{

    }//int sum2

    private int m{

    }//int m


}//class Fletcher16