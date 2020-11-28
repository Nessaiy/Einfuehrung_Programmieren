public class Chess{
    public static void main(String[] args){
        String black = "* ";
        String white = "  ";
        int chessSize = Integer.parseInt(args[0]);

        if (chessSize%1 ==0 && chessSize > 0){
            /*
            Zeile als i, Spalte als j, chesssize als Feldgröße
            Zeile 0: * - * -> 0/0 0/1 0/2
            Zeile 1: - * - -> 1/0 1/1
            Zeile 2: * - *
            */
            for (int i = 0; i < chessSize; i++){
                for (int j = 0; j< chessSize; j++){
                    if ((i+j)%2 == 0){
                        System.out.print(black);
                    } else {
                        System.out.print(white);
                    }   
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }
    }
}