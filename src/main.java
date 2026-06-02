import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    StudentDAO dao = new StudentDAO();

    System.out.println("===== Student Management System =====");
    System.out.println("1. Add Student");

    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();

    if (choice == 1) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        Student student = new Student(id, name, age);

        dao.addStudent(student);
    }

    sc.close();
}

}