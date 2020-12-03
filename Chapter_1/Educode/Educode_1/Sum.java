public class Sum {
    public static void main(String[] args){
        int sum = 0;

        int length = args.length;
        int[] zahlen;
        zahlen = new int[length];

        for (int i = 0; i < length; i++){
            zahlen[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < length; i++){
            sum = sum + zahlen[i];
        }
        System.out.println(sum);
    }
}
