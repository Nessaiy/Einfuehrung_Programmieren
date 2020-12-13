public class RemoveDuplicates {

    public static void main(String[] args){
        int a = args.length;
        double[] arr = new double[a];
        int counter1 = 0;

        while (!StdIn.isEmpty()) {
                arr[counter1] = StdIn.readDouble();
                counter1++; 
        }


        double current = arr[0];
        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (current == arr[i] && !found) {
                found = true;
            } else if (current != arr[i]) {
                System.out.println(current);
                current = arr[i];
                found = false;
            }
        }
        System.out.println(current);
    }
}




 