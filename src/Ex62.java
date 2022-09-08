import java.util.ArrayList;

public class Ex62 {
    public static void removeLast(ArrayList<String> list){
        list.remove(3);
    }

    public static void main(String[] args) {

    ArrayList<String> brothers = new ArrayList<String>();
brothers.add("Dick");
brothers.add("Henry");
brothers.add("Michael");
brothers.add("Bob");

System.out.println("brothers:");
System.out.println(brothers);

    // removing the last item
    removeLast(brothers);

System.out.println(brothers);
}
}
