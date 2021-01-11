public class Potenz {
    private static int potenzRecursive(int x, int y){
        if (y==1) {
            return x;
        } else {
            return (x * potenzRecursive(x,y-1));
        }
    }//potenzRecursive

    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println(potenzRecursive(x, y));
    }//main
}
