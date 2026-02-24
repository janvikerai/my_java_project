class Student extends User implements Actions {

    private int books = 0;

    public Student(String name, int id) {
        super(name, id);
    }

    public void showDetails() {
        System.out.println("Student Name : " + getName());
        System.out.println("Student ID   : " + getId());
        System.out.println("Books Taken  : " + books);
    }

    public void take() {
        books++;
        System.out.println("Book taken.");
    }

    public void giveBack() {
        books--;
        System.out.println("Book returned.");
    }
}
