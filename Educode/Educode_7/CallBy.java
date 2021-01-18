public class CallBy {
    private static int[] changeValue(int[] arr){
        int l = arr.length;
        int temp = arr[0];
        arr[0] = arr[l];
        arr[l] = temp;
        return arr;
    }//changeValue

    /*
    private static int[] createNewArray(int[] arr){
        
    }//createNewArray
    */

    public static void main(String[] args){

    }//main
}
