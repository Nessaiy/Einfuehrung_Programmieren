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
                    int inputZahl = Integer.parseInt(input[offset]);
                    matrix[i][j] = inputZahl;
                    offset = offset + 1;
                }
            }
        }

        return matrix;

    }

    private static int computeEntry(int[][] m1, int[][] m2, int row, int column) {
        int computeEntry = 0;
        
        for (int i = 0; i < m2[0].length; i++){
            computeEntry += m1[row][i] * m2[i][column]; 
        }

        return computeEntry;
    
    }

    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int column = Integer.parseInt(args[1]);

        //Matrix 1 einlesen
        int[][] matrix_1 = readMatrix(args, 0);

        //Matrix 2 einlesen
        int[][] matrix_2 = readMatrix(args, row * column + 2);

        //MatrixMult berechnen
        int[][] matrix_produkt = new int [row][column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix_produkt[i][j] = computeEntry(matrix_1, matrix_2, i, j);
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matrix_produkt[i][j]);
            }
            System.out.println();
        }
    }
}
