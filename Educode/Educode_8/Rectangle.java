public class Rectangle {

    public Rectangle(int width, int height){
        width = 5;
        height = 5;
    }//Rectangle

    public int area(int width, int height){
        int area = width * height;
        return area;
    }//area

    public int perimeter(int width, int height){
        int perimeter = 2 * width + 2 * height;
        return perimeter;
    }//perimeter

    public boolean isSquare(int width, int height){
        boolean isSquare;
        if (width == height) isSquare = true;
        else isSquare = false;
        return isSquare;
    }//isSquare

    public void draw(int width, int height){
        for (int i = 0; i <= width; i++){
            for (int j = 0; j <= height; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }//draw
    public static void main(String[] args){
        int width;
        int height;

        Rectangle.draw(width, height);
    }//main
}
