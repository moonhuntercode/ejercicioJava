package App3;

public class AppThree {
    // attributes
    String Nombre = "Inocencio";
    String LastName = "Virgo";
    String Apodo;

    // methods
    public void despierta() {
        System.out.println("despierta y bosteza");
    }

    public void desayuna() {
        System.out.println("desayuna mm riquito masaco de yuca");
    }

    public void almuerza() {
        System.out.println("almuerza un rriquito churrasco mmmm!");
    }

    static int sum(int n1, int n2) {
        return n1 + n2;
    }

    // 152 =>[1,5,2]
    // 0=>[0]
    public static int[] digitize() {
        // Code here
        long n=222;
        int number =(int) n;
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
            System.out.print(numbers[i] );
        }
        return numbers;

    }

    public static int binToDecimal(String inp){
        // your code here
            
        return Integer.parseInt(inp,2);
      }
    public static void main(String[] args) {
        AppThree obj1 = new AppThree();
        obj1.digitize();
    }
}
