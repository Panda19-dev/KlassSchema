import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        List<Staff> staffList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int students = 0;
        int staff = 0;
        try {
            System.out.println("How many students you want?");
            students = sc.nextInt();
            System.out.println("How many staff you want?");
            staff = sc.nextInt();
        } catch (Exception e) {
            System.out.println("You need to enter a number!");
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Enter the student's name: ");
            String name = sc.next();
            System.out.println("Enter the student's address: ");
            String address = sc.next();
            System.out.println("Enter the student's program: ");
            String program = sc.next();
            int year = 0;
            double fee = 0;
            try {
                System.out.println("Enter the student's year: ");
                year = sc.nextInt();
                System.out.println("Enter the student's fee: ");
                fee = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("You need to write a number!");
            }
            Student student1 = new Student(name, address, program, year, fee);
            studentList.add(student1);
            System.out.println("You created a profile that looks like this : " + student1);
        }

        for (int i = 0; i < staff; i++) {
            System.out.println("Enter the staff's name: ");
            String name = sc.next();
            System.out.println("Enter the staff's address: ");
            String address = sc.next();
            System.out.println("Enter the staff's school: ");
            String school = sc.next();
            double pay = 0;
            try {
                System.out.println("Enter the staff's pay: ");
                pay = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("You need to write a number!");
            }
            Staff staff1 = new Staff(name, address, school, pay);
            staffList.add(staff1);
            System.out.println("You created a profile that looks like this : " + staff1);
        }





        /*
        Student student1 = new Student("Tilda Aronson", "Gretusväg 11", "Artitektur", 2, 500000);
        Student student2 = new Student("Robert Gustavson", "Rågatan 24", "Musik", 7, 10);
        Staff staff1 = new Staff("Per Johansson", "skulpturgatan 24d", "NTI Odenplan", 420);
        Staff staff2 = new Staff("Anna greata kärsinson", "Ekonomgatan 143f", "Östra Real", 10);
        Person person1 = new Person("Tilda Josefina Greta Thunberg Andersson", "Justeröboulevarden 444a");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println(person1);
         */
    }
}