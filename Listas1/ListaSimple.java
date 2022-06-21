
import java.util.*;
import java.util.stream.*;

class Nodo{
    int info;
     Nodo punteroSiguiente;
    Nodo(){
        punteroSiguiente=null;
    }
}

public class ListaSimple {
    Nodo listaS;
    ListaSimple(){
        this.listaS=null;
    }
    public void imprimirLista(){
        if (listaS==null){
            System.out.println("lista vacia");
        }
        else {
            Nodo punteroAuxiliar=   listaS;
            while (punteroAuxiliar!=null){
                System.out.print(punteroAuxiliar.info+" ");
        punteroAuxiliar=punteroAuxiliar.punteroSiguiente;
}
        }
    }

    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo=new Nodo();
        nuevoNodo.info=dato;
        nuevoNodo.punteroSiguiente=listaS;
        listaS=nuevoNodo;
    }
    public int leyendoDato(){
        Scanner leyendo=new Scanner(System.in);
        return leyendo.nextInt();
    }
public  int contadorNodos() {
    int contador2=0;
    if (listaS == null) {
        System.out.println("lista vacia");
    } else {

        Nodo punteroAuxiliar2 = listaS;
        while (punteroAuxiliar2 != null) {
            contador2++;
        }
    }
    return contador2;
}
    public void descendentMode() {
        int contador=0,contador2;

        if (listaS==null){

            System.out.println("lista vacia");
        }
        else {
            Nodo punteroAuxiliar=   listaS;

           List<Integer> slist=new LinkedList<Integer>();
            List<Integer> sortedList=new LinkedList<Integer>();
            while (punteroAuxiliar!=null){
                slist.add(punteroAuxiliar.info);
                sortedList = slist.stream().sorted().collect(Collectors.toList());
                contador++;
//                System.out.print(punteroAuxiliar.info+" ");

                punteroAuxiliar=punteroAuxiliar.punteroSiguiente;


        }
            System.out.println("After Sorting: "+ sortedList);

    }
    }

    public static void main(String[] args) {
ListaSimple lista=new ListaSimple();
Nodo objeto2=new Nodo();
        int valor1,desicion;

        System.out.println("el valor1 es: "+objeto2.punteroSiguiente);
        do{
            System.out.println();
            System.out.println("MENU DE OPCIONES");
            System.out.println("1.- INSERT TO START");
            System.out.println("2.- INSERT TO END");
            System.out.println("3.- EXIT");
            System.out.println("4.- PRINT ALL LIST");
            System.out.println("5.-DESCENDENT MODE");
            System.out.println("6.-ELIMINAR SEGUN POSICION");


            System.out.println("----------");
            System.out.println("que opcion quiere?");
            Scanner entradaDatos=new Scanner(System.in);
            desicion=entradaDatos.nextInt();

            switch (desicion) {
                case 1 -> {
                    System.out.println("eligioo a OPCION 1");
                    valor1 = lista.leyendoDato();
                    lista.insertarAlInicio(valor1);
                    System.out.println("----------");
                }
                case 2 -> {
                    System.out.println("eligioo a OPCION 2");
                    System.out.println("----------");
                }
                case 3 -> {
                    System.out.println("gracias por elegirnos");
                    System.exit(0);
                }
                case 4 -> lista.imprimirLista();
                case 5-> lista.descendentMode();
                case 6->lista.eliminarPosicion();

                default -> System.out.println("opcion inválida");
            }

        }while (desicion!=100);
    }

    private void eliminarPosicion() {

        int contador=0;
        if (listaS==null){
            System.out.println("lista vacia");
        }
        else {
            num = new int[cantidad];
            Nodo punteroAuxiliar=   listaS;
            while (punteroAuxiliar!=null){
                num[contador]=punteroAuxiliar.info;
                        contador++;
                System.out.print(punteroAuxiliar.info+" ");
                punteroAuxiliar=punteroAuxiliar.punteroSiguiente;
            }
        }
    }


}