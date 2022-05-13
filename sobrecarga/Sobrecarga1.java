/**
 * Sobrecarga1
 */
public class Sobrecarga1 {
public static   int suma(int a ,int b){
System.out.println("int , int");

return a+b;
}
public static  double  suma(Double a,Double b){
    System.out.println("Double, Double");
    
    return a+b;
}
public static  double suma(int a,Double b){
    System.out.println("int, double");
    return a+b;
}
public static double  suma(Double a,int b){
    System.out.println(" double , int");
    return a+b;
}
    public static void main(String[] args) {
        Sobrecarga1 objeto1 =new Sobrecarga1();
            System.out.println("result 1:"+Sobrecarga1.suma(3, 3));
            System.out.println("result 1:"+Sobrecarga1.suma(2.0, 4));
            // System.out.println("result 1:"+Sobrecarga1.suma(3F, 'A'));



    }
}