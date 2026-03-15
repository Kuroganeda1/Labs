public abstract class MediaItem extends Item {

    int runtime;

    public MediaItem() {
        super();
        runtime = 0;
    }

    public MediaItem(int iId, String iTitle, int iCopies, int iRuntime) {
        super(iId, iTitle, iCopies);
        runtime = iRuntime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int iRuntime) {
        runtime = iRuntime;
    }

    public String toString() {
        return super.toString() + "\nRUNTIME: " + runtime + " minutes\n";
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof MediaItem))
            return false;
        MediaItem m = (MediaItem) obj;
        return runtime == m.runtime;
    }
}
