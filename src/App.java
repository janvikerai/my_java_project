public class App {

    public static void main(String[] args) {

        System.out.println("===== LIBRARY SYSTEM - JHANVI VERSION =====\n");

        Student s = new Student("Jhanvi", 10);
        // adding books
        LibraryBook b = new LibraryBook("Database Basics");
        Librarian l = new Librarian("Mr. Rahul", 1, "EMP100");

        System.out.println("--- STUDENT ---");
        s.showDetails();
        s.take();
        System.out.println();

        System.out.println("--- BOOK ---");
        b.showBook();
        b.take();
        b.giveBack();
        System.out.println();

        System.out.println("--- LIBRARIAN ---");
        l.showDetails();
        l.add();
        l.remove();
    }
}