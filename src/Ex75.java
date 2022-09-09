public class Ex75 {
    public static class DecreasingCounter {
        private int value;   // object variable that remembers the value of the counter
        private int StartVal;

        public DecreasingCounter(int valueAtStart) {
            this.value = valueAtStart;
            this.StartVal = valueAtStart;

        }
        public void setInitial(){
        this.value=StartVal;
        }
        public void printValue() {
            System.out.println("value: " + this.value);
        }

        public void decrease() {
            // write here the code that decrements the value of counter by one
            if (this.value !=0) {
                this.value--;
            }
        }
        public void reset() {
            this.value=0;
        }

    }


        public static void main(String[] args) {
            DecreasingCounter counter = new DecreasingCounter(1);

            counter.printValue();

            counter.decrease();
            counter.printValue();

            counter.decrease();
            counter.printValue();
        }
    }



