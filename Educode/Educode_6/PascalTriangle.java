public class PascalTriangle {
    private static int pascalRecursive(int zeile, int spalte){
        if (spalte == 0 || spalte == zeile ){
            return 1;
          } else {
            return pascalRecursive(zeile - 1, spalte - 1) + pascalRecursive(zeile - 1, spalte);
          }
    }//pascalRecursive

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
          //for (int k = 0; k < n - i; k++) {
          //  System.out.print(" ");
          //}
          for (int j = 0; j <= i; j++) {
            System.out.print(pascalRecursive(i, j) + " ");
          }
          System.out.println();
        }
    }//print

    public static void main(String[] args){
        int n = Integer.parseInt(args[0])+1;
        print(n);
    }//main
}

