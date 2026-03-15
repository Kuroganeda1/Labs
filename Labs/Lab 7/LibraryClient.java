public class LibraryClient {
    public static void main(String[] args) {

        Book b = new Book(123456, "To kill a mocking bird", 5, "Harper Lee");
        b.print();

        System.out.println("After the book was checked out, the number of copies changed. The new info is:");
        b.checkOut();
        b.print();

        System.out.println("After a new copy of this book was added, the number of copies changed. The new info is:");
        b.checkIn();
        b.print();

        System.out.println();

        Video v = new Video(1111, "The Godfather", 3, 215, "Francis Ford Coppola", "drama", 1981);
        v.print();

        System.out.println("After the video was checked in, the number of copies changed. The new info is:");
        v.checkIn();
        v.print();
    }
}
