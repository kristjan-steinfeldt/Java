public class W8Ex10 {
    public interface NationalService {
        int getDaysLeft();
        void work();

        //the method int getDaysLeft() which returns the number of days left on service
        //the method void work(), which reduces the working days by one
    }
class CivilService implements NationalService{

        public int getDaysLeft(){
            return daysLeft;
        }

    @Override
    public void work() {
     daysLeft--;
    }

    private int daysLeft;

    public void NationalService(){
        this.daysLeft=362;

    }
}
    class MilitaryService implements NationalService{
        private int daysLeft;
        public MilitaryService(int days){
            this.daysLeft=days;

        }

        public int getDaysLeft(){
            return daysLeft;
        }

        @Override
        public void work() {
            daysLeft--;
        }
    }
}
