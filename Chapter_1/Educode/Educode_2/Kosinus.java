public class Kosinus {
    /*
    Kosinus

Schreiben Sie ein Programm Cosinus, welches einen Parameter 
x
x entgegennimmt und die Kosinusfunktion mit Hilfe folgender Taylor-Entwicklung berechnet.

c
o
s
(
x
)
=
1
−
x
2
2
!
+
x
4
4
!
−
x
6
6
!
+
x
8
8
!
⋯
cos(x)=1− 
2!
x 
2
 
​	
 + 
4!
x 
4
 
​	
 − 
6!
x 
6
 
​	
 + 
8!
x 
8
 
​	
 ⋯

Für diese Aufgabe reicht es, wenn Sie die ersten 20 Summanden betrachten. Als Summenformel lässt sich die Reihe folgendermaßen ausdrücken:

c
o
s
(
x
)
=
∑
n
=
0
20
(
−
1
)
n
(
2
n
)
!
∗
x
2
n
cos(x)=∑ 
n=0
20
​	
  
(2n)!
(−1) 
n
 
​	
 ∗x 
2n
 

Die Ausgabe soll bei einer gültigen Eingabe auf zwei Nachkommastellen geschnitten werden. Bei ungültigen Eingaben, soll eine Fehlermeldung, welche das Wort ERROR enthält, ausgegeben werden.

Da die Taylor-Entwicklung außerhalb des Intervalls 
[
0
,
2
π
]
[0,2π] zu schnell ungenau wird, muss die Eingabe hierauf abgebildet werden. Da die Kosinusfunktion achsensymmetrisch ist, können negative Eingabewerte einfach in positive umgewandelt werden.

Für diese Aufgabe dürfen Sie aus der Klasse Math ausschließlich die Konstante PI benutzen. Weitere fremde Funktionen oder Konstanten sind zur Berechnung der Formel nicht erlaubt.

Hinweis: Der modulo Operator kann auch auf Variablen vom Typ double angewendet werden.
*/
    public static void main(String[] args){
        
    }
}
