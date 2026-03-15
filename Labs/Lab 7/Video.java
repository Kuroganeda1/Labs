public class Video extends MediaItem {

    String director;
    String genre;
    int yearReleased;

    public Video(int iId, String iTitle, int iCopies, int iRuntime, String iDirector, String iGenre, int iYear) {
        super(iId, iTitle, iCopies, iRuntime);
        director = iDirector;
        genre = iGenre;
        yearReleased = iYear;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setDirector(String iDirector) {
        director = iDirector;
    }

    public void setGenre(String iGenre) {
        genre = iGenre;
    }

    public void setYearReleased(int iYear) {
        yearReleased = iYear;
    }

    public void print() {
        System.out.println("Display info about a video");
        System.out.println(toString());
    }

    public String toString() {
        return super.toString() +
               "Director: " + director + "\n" +
               "Genre: " + genre + "\n" +
               "Year Released: " + yearReleased + "\n";
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof Video))
            return false;
        Video v = (Video) obj;
        return director.equals(v.director) &&
               genre.equals(v.genre) &&
               yearReleased == v.yearReleased;
    }
}
