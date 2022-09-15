public class Ex97 {
        public static void main(String[] args) {
            int[] array = {5, 1, 3, 4, 2};
            printElegantly(array);
        }

        public static void printElegantly(int[] array) {

                int n=0;
                while (n< array.length){
                    Integer i=array[n];
                    if (n==array.length-1){
                        System.out.print(i+"");
                        break;
                    }
                    System.out.print(i+", ");
                    n++;
                }

            }



        }