import java.util.ArrayList;
import java.util.Scanner;

public class Ex88 {
 public static class Student{
     private String name;
     private String studentNumber;


     public Student(String StudentName,String StudentNr) {
         this.name=StudentName;
         this.studentNumber=StudentNr;
     }
     public String getName(){
        return this.name;
     }
     public String getStudentNumber(){
         return  this.studentNumber;
     }
     public String toString(){
         return (this.name+" ("+this.studentNumber+")");
     }
     //that returns a String representation of the form: Pekka Mikkola (013141590)




 }
        public static void main(String[] args) {
            Student pekka = new Student("Pekka Mikkola", "013141590");
            ArrayList<Student> list = new ArrayList<Student>();
            list.add(pekka);
            boolean i=true;
            while (i=true){
            Scanner reader = new Scanner(System.in);
            System.out.println("Name: ");
            String inName = reader.nextLine();
                if (inName.isBlank()){
                    list.forEach(System.out::println);
                    break;
                }
            System.out.println("Student number: ");
            String inNr = reader.nextLine();
            Student NewStudent = new Student(inName, inNr);

                list.add(NewStudent);
            }
            Scanner search= new Scanner(System.in);
            System.out.println("Enter search term:");
            String toSearch= search.nextLine();
            int n= list.size()-1;
            while (n>=0) {
                if (list.get(n).getName().contains(toSearch)) {
                    System.out.println(list.get(n).toString());
                    n--;
                }
            }
        }
    }


