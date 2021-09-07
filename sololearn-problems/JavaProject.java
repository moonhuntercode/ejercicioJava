package 
import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}


//your code goes here
class Circle extends Shape{
    public void area(int width){
        double area=Math.PI*width;
        System.out.println(area);
    }
    public Circle(Double b){
    b=0.0;
    }

    @Override
    void area() {
        System.out.println(Math.PI*width);
    }
}
class Square extends Shape{
public Square(int a){
    a=0;
}
@Override
void area() {
    // TODO Auto-generated method stub
        System.out.println(Math.sqrt(width));
}

}

public class JavaProject {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = 12;
        double y = 5;
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}