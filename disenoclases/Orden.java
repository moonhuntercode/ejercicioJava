package disenoclases;
public class Orden {
    private int idOrden;
    private Producto productos[];//declaramos la variable productos
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS=10;

    Orden(){
        // private int[] agregarProducto()
        // private double calcularTotal()
        this.idOrden=++contadorOrdenes;
        productos=new Producto[MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        productos[contadorProductos++]=producto;
    }

    
    
}
