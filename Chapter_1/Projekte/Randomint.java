public class RandomInt {
    public static void main(String[] args)
    {
        int L = Integer.parseInt(args[0]);
        int R = Integer.parseInt(args[1]);
        double r = Math.random();
        int n = L + (int) (r*(R-L));
        if (L == R) n = L;
        System.out.print("Die Zufällige Zahl zwischen " + L + " und " + R + " ist: ");
        System.out.println(n);
    }
}