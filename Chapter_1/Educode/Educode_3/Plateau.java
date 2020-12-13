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
        if (args.length < 3){
            System.out.println("ERROR");
            return;
        }

        int[] a = new int[args.length];
        for (int i=0; i < args.length; i++){
            a[i] = Integer.parseInt(args[i]);
        }

        int zaehler = 1;						        // zeahler zaehlt die Durchlaeufe bei einer gleichen Zahl
		int aktuellerWert = a[0];				        // aktuellerWert wird auf den ersten Wert des Arrays gesetzt (=0)
        int hoechsterZaehler = 0;
        int stelle = 0;

        boolean test = true; //Aufsteigend?
        for (int i = 0; i < a.length-1; i++){
            if (a[i+1]<a[i]){
                test = false;
            }
        }
        if (test){  //wenn aufsteigend, dann kein plateau und main beenden
            System.out.print("Kein Plateau");
            System.exit(0);
        }

        
		for (int i = 0; i < a.length; i++) {
			int neuerWert = a[i];				        // im ersten Durchlauf sind neuerWert und aktueller Wert identisch
			if (neuerWert == aktuellerWert) {			// wenn neuerWert gleich aktuellerWert dann:
				zaehler += 1;							// soll die Durchlaeufe zaehlen, pro wiederholte (gleiche) Zahl +1 dazuzaehlen
                if (zaehler > hoechsterZaehler) {		// wenn der aktuelle zaehler groeßer als der letzte hoechsterZaehler ist, dann:
                    hoechsterZaehler = zaehler;			// hoechsterZaehler auf aktuelle zaehler setzen
                    stelle = i + 1 - zaehler;
				}
			} else if (neuerWert < aktuellerWert) {		// sonst: wenn neuerWert kleiner als aktuellerWert dann Schleifendurchlauf abbrechen und neuen Durchlauf beginnen
				aktuellerWert = a[i];					// sobald eine kleinerer Wert auftritt, wird auch hier der aktuelleWert auf i gesetzt
                zaehler = 1;							// zaehler wird auf 1 gesetzt      
                continue;                       
			}
			aktuellerWert = a[i];						// aktuellerWert wird wieder auf i gesetzt (entsprechender Wert)
        }

        if (args.length == 3){                          // stelle funzt sonst bei 1 2 1 nicht
            stelle = 1;
        }
    
        System.out.print(hoechsterZaehler + " ");
        System.out.println(stelle);


    }//main
}//class
