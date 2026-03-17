import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("===== LIBRARY SYSTEM =====");

            // Student input
            System.out.print("Enter Student Name: ");
            String sName = sc.nextLine();

            System.out.print("Enter Student ID: ");
            int sId = sc.nextInt();
            sc.nextLine();

            Student s = new Student(sName, sId);

            // Book input
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            LibraryBook b = new LibraryBook(title);

            // Librarian input
            System.out.print("Enter Librarian Name: ");
            String lName = sc.nextLine();

            System.out.print("Enter Librarian ID: ");
            int lId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Code: ");
            String code = sc.nextLine();

            Librarian l = new Librarian(lName, lId, code);

            // Output
            System.out.println("\n--- STUDENT ---");
            s.showDetails();
            s.take();

            System.out.println("\n--- BOOK ---");
            b.showBook();
            b.take();
            b.giveBack();

            System.out.println("\n--- LIBRARIAN ---");
            l.showDetails();
            l.add();
            l.remove();

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter correct data.");
        } finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}