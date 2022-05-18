package Operators1;
import java.util.Scanner;

/**
 * Array1
 */
public class Operadores1 {

    public static void Divisores(int n){
        var a=3;
        var b=6;
        var c= a>b;
        System.out.println("el valor es: "+c);
        System.out.println("valor de a: "+--a);
        System.out.println("valor de b: "+--b);


    }
    public static void main(String[] args) {
        //descubriendo divisores de un numero
        Scanner leer1 =new Scanner(System.in); 
        int a,result;
        a=leer1.nextInt();
        Divisores(a);
        // System.out.println("terminando todo: "+result);
        leer1.close();
        
    }
}