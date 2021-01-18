public class Ractangle {

    //public Rectangle(int width, int height){

    //}//Rectangle

    public int area(int width, int height){
        area = width * height;
        return area;
    }//area

    public int perimeter(int width, int heigth){
        perimeter = 2 * width + 2 * heigth;
        return perimeter;
    }//perimeter

    public boolean isSquare(int width, int heigth){
        if (width = height) isSquare = true;
        else isSquare = false;
        return isSquare;
    }//isSquare

    public void draw(int width, int height){
        for (int i = 0; i <= width; i++){
            for (int j = 0; j <= heigth; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }//draw
    public static void main(String[] args){
        int width;
        int heigth;

        width = 5;
        heigth = 5;

        draw(width, height);
    }//main
}
