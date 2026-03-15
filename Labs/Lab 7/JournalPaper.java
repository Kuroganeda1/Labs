public class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int numCopies, String author, int yearPublished) {
        super(id, title, numCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() { return yearPublished; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }

    public void print() {
        System.out.println("Display info about a journal paper");
        System.out.println(toString());
        System.out.println("YEAR PUBLISHED: " + yearPublished);
    }

    public String toString() {
        return super.toString() + "\nYEAR PUBLISHED: " + yearPublished;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof JournalPaper)) return false;
        JournalPaper other = (JournalPaper) obj;
        return this.yearPublished == other.yearPublished;
    }
}
