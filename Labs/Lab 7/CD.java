    public class CD extends MediaItem {
        private String artist;
        private String genre;

        public CD(int id, String title, int numCopies, int runtime, String artist, String genre) {
            super(id, title, numCopies, runtime);
            this.artist = artist;
            this.genre = genre;
        }

        public String getArtist() { 
            return artist;
        }
        public String getGenre() { 
            return genre;
        }

        public void setArtist(String artist) { 
            this.artist = artist;
        }
        public void setGenre(String genre) { 
            this.genre = genre; 
        }

        public void print() {
            System.out.println("Display info about a CD");
            System.out.println(toString());
        }

        public String toString() {
            return super.toString() +
            "Artist: " + artist +
            "Genre: " + genre;
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj) || !(obj instanceof CD)) return false;
            CD other = (CD) obj;
            return this.artist.equals(other.artist) &&
            this.genre.equals(other.genre);
        }
    }
