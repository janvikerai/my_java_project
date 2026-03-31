import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> records = new ArrayList<>();

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

            // ✅ USING OBJECTS (fixes warnings)
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

            // Store data in collection
            records.add("Student: " + sName + ", ID: " + sId);
            records.add("Book: " + title);
            records.add("Librarian: " + lName + ", Code: " + code);

            // Save to file
            BufferedWriter writer = new BufferedWriter(new FileWriter("library_data.txt"));
            for (String record : records) {
                writer.write(record);
                writer.newLine();
            }
            writer.close();

            System.out.println("\nData saved successfully!");

            // Read from file
            System.out.println("\n--- SAVED DATA ---");
            BufferedReader reader = new BufferedReader(new FileReader("library_data.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Invalid input! Please try again.");
        } finally {
            sc.close();
            System.out.println("\nProgram ended safely.");
        }
    }
}