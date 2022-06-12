// length()
// In Java, the length() string method returns the length ⁠— total number of characters ⁠— of a String.

// Suppose we have a String called str, str.length() would return its length.

// Take a look at this code for example:
/**
 * Methods
 */
public class Methods {

    public static void DevuelveTamaño(){
        String str = "Hello World!";  
        System.out.println("el tamaño del str es: "+str.length());
    }
    public static  void FullName(){
  // Add your first names:
  String firstName = "Ziggy";  
  String lastName = "Stardust";

  // What's the full name?
  System.out.println(firstName.concat(" " + lastName));
    }
    public static void main(String[] args) {
        DevuelveTamaño();
FullName();
    }
}

// 12 would be printed because str has 12 characters:

// H e l l o _ W o r l d !

// In theory, the length of a String is the same as the Unicode units of the String. For example, escape sequences such as \n count as only one character.