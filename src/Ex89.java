public class Ex89 {


    public static class Clock {
        public void tick() {
            this.seconds++;
            if (this.seconds==60){
                this.seconds=0;
                this.minutes++;
                if (this.minutes==60){
                    this.minutes=0;
                    this.hours++;
                    if (this.hours==24){
                        this.hours=0;
                    }
                }
            }
        }

        private int hours;
        private int minutes;
        private int seconds;

        public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
            this.hours=hoursAtBeginning;
            this.minutes=minutesAtBeginning;
            this.seconds=secondsAtBeginning;
        }
        public String toString() {
            String string = this.hours + ":" + this.minutes + ":" + this.seconds;
            return string;
        }


    }

    public static void main(String[] args) {

        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while( i < 20) {
            System.out.println(clock.toString());
            clock.tick();
            i++;
        }
    }}

