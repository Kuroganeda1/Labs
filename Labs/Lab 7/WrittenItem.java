public abstract class WrittenItem extends Item {

    String author;

    public WrittenItem() {
        super();
        author = "";
    }

    public WrittenItem(int iId, String iTitle, int iCopies, String iAuthor) {
        super(iId, iTitle, iCopies);
        author = iAuthor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String iAuthor) {
        author = iAuthor;
    }

    public String toString() {
        return super.toString() + "\nAUTHOR: " + author;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof WrittenItem))
            return false;
        WrittenItem w = (WrittenItem) obj;
        return author.equals(w.author);
    }
}
