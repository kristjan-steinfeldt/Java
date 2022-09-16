import java.util.ArrayList;
import java.util.HashMap;

public class W9Ex9 {
    public static class RegistrationPlate {
        // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
        private final String regCode;
        private final String country;

        public RegistrationPlate(String regCode, String country) {
            this.regCode = regCode;
            this.country = country;
        }
        @Override
        public String toString(){
            return country+ " "+regCode;
        }
    }
    public class VehicleRegister{
        HashMap<Object,String> VehicleOwner= new HashMap();


        public boolean add(RegistrationPlate plate, String owner){
            if (VehicleOwner.get(plate)==null){
                VehicleOwner.put(plate, owner);
                return true;
            }
            else return false;
        }
        public String get(RegistrationPlate plate){
            return VehicleOwner.get(plate);
        }

        public boolean delete(RegistrationPlate plate){
            if (VehicleOwner.get(plate)!=null){
                VehicleOwner.remove(plate);
                return true;
            }
            else return false;
        }

        public void printRegistrationPlates(){
            for (Object i : VehicleOwner.keySet()) {
                System.out.println(i.toString());
            }
            }
        public void printOwners() {
            for (String n:VehicleOwner.values()){
                System.out.println(n);
            }
        }

        }

         public static void main(String[] args) {
            RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
            RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
            RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

            ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
            finnish.add(reg1);
            finnish.add(reg2);

            RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
            if (!finnish.contains(newPlate)) {
                finnish.add(newPlate);
            }
            System.out.println("Finnish: " + finnish);

            HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
            owners.put(reg1, "Arto");
            owners.put(reg3, "Jürgen");

            System.out.println("owners:");
            System.out.println(owners.get(reg1));
            System.out.println(owners.get(reg3));
            // if the hashCode hasn't been overwritten, the owners are not found
        }

    }

