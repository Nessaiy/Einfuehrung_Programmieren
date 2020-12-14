public class MatrixMult {

    private static int[][] readMatrix (String[] input, int offset) {
        //Matrix vorhanden?
        if(input.length < 1){
            return null;
        }

        int zeilen = Integer.parseInt(input[offset]); //Zeilen einlesen, für erste matrix offset = 0, fürs zweite offset = 2 + row * colum + 1
        int spalten = Integer.parseInt(input[offset + 1]); //Spalten einlesen, f+r erste matrix offset + 1 = 1, fürs zweite offset = 2 + row * colum + 1+1
        
        int [][] matrix = new int [zeilen][spalten]; //Matrix einlesen

        if((zeilen < 0) || (spalten < 0) || ((zeilen * spalten) > (input.length - offset - 2)) ){
            return null;
        } else {
            offset = offset + 2; //Um beim ersten Matrix wert zu starten + 2
            for(int i = 0; i < zeilen; i++){
                for(int j = 0; j < spalten; j++){
                    matrix[i][j] = Integer.parseInt(input[offset]);
                    offset = offset + 1; //einen wert wandern
                }
            }
        }
        return matrix; //Matrix zurückgeben
    }

    private static int computeEntry(int[][] m1, int[][] m2, int row, int column) {
        int computeEntry = 0;
        
        for (int i = 0; i < m1[0].length; i++){
            computeEntry += m1[row][i] * m2[i][column]; 
        }
        return computeEntry;
    }

    public static void main(String[] args) {
        int row1 = Integer.parseInt(args[0]);
        int column1 = Integer.parseInt(args[1]);

        int offset = row1 * column1 + 2;

        int row2 = Integer.parseInt(args[offset]);
        int column2 = Integer.parseInt(args[offset + 1]);

        

        if (column1 != row2){
            System.out.println("ERROR");
            return;
        }

        //Matrix 1 einlesen
        int[][] matrix1 = readMatrix(args, 0);

        //Matrix 2 einlesen
        int[][] matrix2 = readMatrix(args, offset);

        
        //MatrixMult berechnen
        int[][] matrixProdukt = new int [row1][column2];

        for(int i = 0; i < row1; i++){
            for(int j = 0; j < column2; j++){
                matrixProdukt[i][j] = computeEntry(matrix1, matrix2, i, j);
            }
        }

        for(int i = 0; i < row1; i++){
            for(int j = 0; j < column2; j++){
                System.out.print(matrixProdukt[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
//"2", "4", "1", "2", "7", "8", "2", "6", "5", "3", "4", "3", "2", "8", "9", "1", "12", "15", "42", "3", "6", "50", "21", "4"
// r1   c1   0,0  0,1  0,2  0,3  1,0  1,1  1,2  1,3  r2  c2  0,0  0,1   0,2  0,3  1,0   1,1   1,2   1,3   2,0  2,1   2,2   2,3
// 0    1    2    3    4    5    6    7    8    9    10  11  12   13    14   15   16    17    18    19    20   21    22    24