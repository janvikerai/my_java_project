class Librarian extends User implements Manage {

    private String employeeCode;

    public Librarian(String name, int id, String employeeCode) {
        super(name, id);
        this.employeeCode = employeeCode;
    }

    public void showDetails() {
        System.out.println("Librarian Name : " + getName());
        System.out.println("Employee Code  : " + employeeCode);
    }

    public void add() {
        System.out.println("Book added to system.");
    }

    public void remove() {
        System.out.println("Book removed from system.");
    }
}
