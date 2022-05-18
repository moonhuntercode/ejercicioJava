package Objects;

public class ObjectOne {
    public ObjectOne() {

    }
    static String name1="Geek";
    private String name2="Geek2";
    public static void main(String[] args) {
        System.out.println("h");

ObjectOne obj= new ObjectOne();
System.out.println(" name: "+ObjectOne.name1);
System.out.println(" name: "+obj.name2);
    }
}