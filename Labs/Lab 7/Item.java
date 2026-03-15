public abstract class Item {
    private int id;
    private String title;
    private int numCopies;

    public Item() {
        id = 0;
        title = "";
        numCopies = 0;
    }

    public Item(int iID, String iTitle, int iNum) {
        setID(iID);
        setTitle(iTitle);
        setNumCopies(iNum);
    }



    public int getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setID(int iID) {
        id = iID;
    }

    public void setTitle(String iTitle) {
        title = iTitle;
    }

    public void setNumCopies(int iNum) {
        numCopies = iNum;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        return id == other.id &&
        title.equals(other.title) &&
        numCopies == other.numCopies;
    }

    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Number of Copies: " + numCopies;
    }

    public void print() {
        System.out.println(toString());
    }

    public void checkIn() {
        numCopies++;
    }

    public void checkOut() {
        if (numCopies > 0) {
            numCopies--;
        } else {
            System.out.println("No copies available to check out.");
        }
    }

    public void addItem(int iNum) {
        if (iNum > 0) {
            numCopies += iNum;
        }
    }
}
