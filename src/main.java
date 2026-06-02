import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("===== Student Management System =====");
    System.out.println("1. Add Student");
    System.out.println("2. View All Students");
    System.out.println("3. Update Student");
    System.out.println("4. Delete Student");
    System.out.println("5. Exit");

    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();

    System.out.println("You selected option: " + choice);

    sc.close();
}

}