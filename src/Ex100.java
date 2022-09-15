import java.util.Random;

public class Ex100 {
    public static class NightSky{
        private double density;
        private int width;
        private int height;
        private int stars=0;

        public NightSky(double Startdensity){
            this.density=Startdensity;
            this.width=20;
            this.height=10;
        }
        public NightSky(int Startwidth, int Startheight) {
            this.density=0.1;
            this.width=Startwidth;
            this.height=Startheight;

        }
        public NightSky(double StartDensity,int StartWidth,int StartHeight){
            this.density=StartDensity;
            this.width=StartWidth;
            this.height=StartHeight;
        }
        public void print() {
            for (int n = 0; n < this.height; n++) {
                for (int i = 0; i < this.width; i++) {
                    int a= new Random().nextInt(10);
                    if (this.density*10==a){
                        System.out.print("*");
                        this.stars++;
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public String starsInLastPrint(){
            return this.stars+"";
        }
    }

    public static void main(String[] args) {

        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky = new NightSky(0.2, 15, 6);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
