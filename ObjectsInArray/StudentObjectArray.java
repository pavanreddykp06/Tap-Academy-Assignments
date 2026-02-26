import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double marks;
}

public class StudentObjectArray{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {

            students[i] = new Student();  

            System.out.println("Enter name:");
            students[i].name = sc.nextLine();

            System.out.println("Enter roll number:");
            students[i].rollNo = sc.nextInt();

            System.out.println("Enter marks:");
            students[i].marks = sc.nextDouble();
            sc.nextLine();  
        }

        System.out.println("\nStudent Details:");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].rollNo + " " + students[i].marks);
        }

    }
}