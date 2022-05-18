package COla;
import java.util.Scanner;

public class ColaEstatica01
{
	int MAX=10;
	int Infor[]=new int[MAX];
	int Ini;
	int Fin;

	public ColaEstatica01()
	{
		Ini=0;
		Fin=-1;
	}

	public int Leer_Dato()
	{
		Scanner tecla=new Scanner(System.in);
		int dato=tecla.nextInt();
		return dato;
	}
	
	public void Insertar(int dato)
	{
		if(Fin==MAX-1)
	        System.out.print("COLA LLENA !!");
	     else
	      {
	         Fin++;
	         Infor[Fin]=dato;
	      }
	}
	
	public void Eliminar()
	  {
	     if(Fin==-1)
	        System.out.print("COLA VACIA !!"); 
	     else
	     {
	       System.out.print("Elemento Eliminado= "+ Infor[Ini]);
	       for(int i=0; i<Fin; i++)
	          Infor[i]=Infor[i+1];
	        
	        Fin--;
	     }
	  }

	public void Imprimir()
	{
		if(Fin==-1)
			System.out.print("COLA VACIA!!!");
		else
		{
			for(int i=Ini;i<=Fin;i++)
			  System.out.print(Infor[i]+" ");	
		}	
	}
	
	public static void main(String[] args) {
	 int opcion;
	 ColaEstatica01 col=new ColaEstatica01();
	 do {
		 System.out.println();
		 System.out.println("1. INSERTAR ");
		 System.out.println("2. ELIMINAR ");
		 System.out.println("3. IMPRIMIR COLA ");
		 System.out.println("4. SALIR ");
		 System.out.println("ELIJA UNA OPCI�N:  ");
		 opcion=col.Leer_Dato();
		 switch(opcion)
		 {
			 case 1: System.out.print("Digite el dato a insertar: ");
			 	     int dato=col.Leer_Dato();
			 	     col.Insertar(dato);
			 	     break;
			 case 2: col.Eliminar();
			 	     break;
			 case 3: col.Imprimir();
			 	     break;
			 case 4: System.exit(0);
			 default: System.out.print("Eroor, no existe opci�n ");
			 
		 }
	 }while(opcion!=4);

	}

}





