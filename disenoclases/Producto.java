package disenoclases;
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

// constructor vacio
    private Producto(){
        this.idProducto=++contadorProductos;
    }

//Constructor sobrecargado de 2 args
public Producto(String nombre,double precio){
    this();//llama a constructor vacio para inicializar idProduct
    this.nombre=nombre;
    this.precio=precio;
}


public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public int getIdProducto() {
        return idProducto;
    }
    

public static  int getContadorProductos(){
return contadorProductos;
}

@Override
public String toString(){
    return "Producto{"+"idProducto="+idProducto+",nombre="+nombre+",precio="+precio+"}";
}
// public static void setContadorProductos(int contadorProductos){
//     Producto.contadorProductos=contadorProductos;
// }

    


}
