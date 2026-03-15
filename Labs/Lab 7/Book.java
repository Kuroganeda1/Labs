public class Book extends WrittenItem {
    public Book(int id, String title, int numCopies, String author) {
        super(id, title, numCopies, author);
    }

    public void print() {
        System.out.println("Display info about a book");
        System.out.println(toString());
    }
}
