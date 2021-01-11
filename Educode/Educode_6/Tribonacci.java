public class Tribonacci {
    private static int tribonacciRecursive(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 0;
        } else if(n == 2){
            return 1;
        } else{
            return tribonacciRecursive(n - 1) + tribonacciRecursive(n - 2) + tribonacciRecursive(n - 3);
        }
    }//tribonacciRecursive

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i <= n; i++){
            System.out.print(tribonacciRecursive(i));
            if (i <= (n - 1) ) System.out.print(",");
        }

    }//main
}
