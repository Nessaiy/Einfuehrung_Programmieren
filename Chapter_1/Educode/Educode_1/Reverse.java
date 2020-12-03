public class Reverse {
    public static void main(String[] args){
        int length = args.length;
        String[] reverseString;
        reverseString = new String[length];

        for (int i = 0; i < length; i++){
            reverseString[i] = args[length-1-i];
        }

        for (int i = 0; i < length; i++){
            System.out.println(reverseString[i]);
        }
    }
}
