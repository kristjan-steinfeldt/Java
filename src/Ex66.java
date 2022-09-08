import java.util.ArrayList;

public class Ex66 {
    public static int greatest(ArrayList<Integer> list) {
        int max=0;
        int n=list.size()-1;
        while (n>=0) {
            int i = list.get(n);
            n--;

            if (i > max) {
                max = i;
            }
        }
        return  max;
        }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }

}
