
public class Methods {
    public static void main(String[] args) {
dna();

    }

    public static void comprobaDna(){
        String dna1="ATGCGATACGCTTGA";
        String dna2="ATGCGATACGTGA";
        String dna3="ATTAATATGTACTGA";
        String dna=dna2;
        // Find the length:
int length = dna.length();
System.out.println("Length: " + length);
 // Find start codon: 
int start = dna.indexOf("ATG");
System.out.println("Start: " + start);
// Find stop codon:
 int stop = dna.indexOf("TGA");
System.out.println("Stop: " + stop);
        System.out.println(dna.substring(0,3).equals("ATG"));
        System.out.println(dna.substring(10,13).equals("TGA"));
        System.out.println("tamaño"+dna.length());
        }

    public static void dna(){
        String dna1="ATGCGATACGCTTGA";
        String dna2="ATGCGATACGTGA";
        String dna3="ATTAATATGTACTGA";
           String dna=dna2;
        // Find the length:
       int length = dna.length();
       System.out.println("Length: " + length);
        // Find start codon: 
       int start = dna.indexOf("ATG");
       System.out.println("Start: " + start);
       // Find stop codon:
        int stop = dna.indexOf("TGA");
       System.out.println("Stop: " + stop);
       System.out.println("dna+start: "+dna.substring(0,3).equals(start));

       if(
        (start!=-1 && stop!=-1) && 
       ((stop-start)%3==0)
       )
       {
        // String protein="";
            System.out.println("tiene multiplos de 3");
        }
            else{
     System.out.println("no protein.");
            }
    }

    public static void DevuelveTamaño(){
// length()
// In Java, the length() string method returns the length ⁠— total number of characters ⁠— of a String.

// Suppose we have a String called str, str.length() would return its length.

// Take a look at this code for example:
/**
 * Methods
 */
String str = "Hello World!";  
System.out.println("el tamaño del str es: "+str.length());
// 12 would be printed because str has 12 characters:
// H e l l o _ W o r l d !
// In theory, the length of a String is the same as the Unicode units of the String. For example, escape sequences such as \n count as only one character.
    }


    public static  void FullName(){
  // Add your first names:
  String firstName = "Ziggy";  
  String lastName = "Stardust";

  // What's the full name?
  System.out.println(firstName.concat(" " + lastName));
    }


    public static void metodoPaIgualar(){
        // equals()
    // With objects, such as Strings, we can’t use the primitive equality operator == to check for equality between two strings. To test equality with strings, we use a built-in method called equals().
    
    // For example:


    }

}

