import java.util.ArrayList;

public class Ex64 {
    public static int sum(ArrayList<Integer> list) {
        int add=0;
        int n=list.size()-1;
        while (n>=0){

             int i=list.get(n);
            add=add+i;
             n--;
        }
        return add;
    }
    public static double average(ArrayList<Integer> list) {
    float sum=sum(list);
    float len= list.size();
    float avg=sum/len;
    return avg;
}

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }

}
