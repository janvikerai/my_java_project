class LibraryBook implements Actions {

    static int total = 0;
    private String title;
    private boolean available = true;

    public LibraryBook(String title) {
        this.title = title;
        total++;
    }

    public void take() {
        if (available) {
            available = false;
            System.out.println(title + " issued.");
        }
    }

    public void giveBack() {
        available = true;
        System.out.println(title + " returned.");
    }

    public void showBook() {
        System.out.println("Book Title : " + title);
        System.out.println("Available  : " + available);
    }
}