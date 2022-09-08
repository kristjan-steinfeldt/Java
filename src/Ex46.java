public class Ex46 {
    public static double average(int number1, int number2, int number3, int number4) {
        // write your code here
        float numSum=(number1+number2+number3+number4);
        float numAvg=numSum/4;
        return numAvg;
    }

    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }

}
