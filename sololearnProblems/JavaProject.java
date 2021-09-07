package sololearnProblems;
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
    public Circle(double y){
        width=(int)y;
    }

    @Override
    void area() {
        System.out.println(Math.PI*width*width);
    }
}
class Square extends Shape{
public Square(int a){
    width=a;
}
@Override
void area() {
    // TODO Auto-generated method stub
        System.out.println((int)(Math.pow(width,2)));
}

}

public class JavaProject {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}