public class MinMax{
    public static void main(String[] args){
        int min;
        int max;

        if (args.length == 0){
            System.out.println("ERROR");
        } else {    
            int[] zahlen;
            zahlen = new int[args.length];
            for (int i = 0; i < args.length; i++){
                zahlen[i] = Integer.parseInt(args[i]);
            }
            min = zahlen[0];
            max = zahlen[0];
            //Zahlen auf Anfangswert setzen

            for (int i = 0; i < args.length; i++){
                if(zahlen[i] < min){
                    min = zahlen[i];
                } else if (zahlen[i] > max){
                    max = zahlen[i];
                }
            }
            System.out.println(min);
            System.out.println(max);
        }
    }
}