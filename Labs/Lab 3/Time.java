public class Time {

    int hrs, mins, secs;

    public Time() {
        hrs = 0;
        mins = 0;
        secs = 0;
    }

    public Time(int ihrs, int imins, int isecs) {

        set(ihrs, imins, isecs);
    }

    public int getHrs() {
        return hrs;
    }

    public int getMins() {
        return mins;
    }

    public int getSecs() {
        return secs;
    }

    public void setHrs(int ihrs) {
        if (ihrs >= 0 && ihrs <= 23)
            hrs = ihrs;
    }

    public void setMins(int imins) {
        if (imins >= 0 && imins <= 59)
            mins = imins;
    }

    public void setSecs(int isecs) {
        if (isecs >= 0 && isecs <= 59)
            secs = isecs;
    }

    public void set(int ihrs, int imins, int isecs) {
        setHrs(ihrs);
        setMins(imins);
        setSecs(isecs);
    }

    public String printStandard() {
        String now = "AM";
        if (hrs >= 12) {
            now = "PM";
        }
        if (hrs > 12) {
            return (hrs - 12) + ":" + mins + ":" + secs + " " + now;
        }
        return (hrs) + ":" + mins + ":" + secs + " " + now;
    }

    public String printMilitary() {
        return hrs + ":" + mins + ":" + secs;
    }

    public String toString() {
        return hrs + ":" + mins + ":" + secs;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Time))
            return false;

        Time t = (Time) obj;
        return hrs == t.getHrs() && mins == t.getMins() && secs == t.getSecs();
    }

    public boolean notEquals(Time otherTime) {
        if (!(equals(otherTime)))
            return true;

        return false;
    }

    public void copy(Object obj) {
        if (!(obj instanceof Time))
            return;
        Time t = (Time) obj;
        set(t.getHrs(), t.getMins(), t.getSecs());
    }

    public Time getCopy() {
        return new Time(hrs, mins, secs);
    }

    public void advanceHour() {
        hrs = hrs > 22 ? 0 : hrs + 1;

    }

    public void advanceMins() {
        mins += 1;
        if (mins > 59) {
            mins = 0;
            advanceHour();
        }
    }

    public void advanceSecs() {
        secs += 1;
        if (secs > 59) {
            secs = 0;
            advanceMins();
        }
    }

    public boolean lessThan(Time otherTime) {
        if (hrs < otherTime.getHrs())
            return true;
        if (hrs == otherTime.getHrs() && mins < otherTime.getMins())
            return true;
        return hrs == otherTime.getHrs() && mins == otherTime.getMins() && secs < otherTime.getSecs();
    }

    public boolean lessOrEquals(Time otherTime) {
        return lessThan(otherTime) || equals(otherTime);
    }

    public boolean greaterThan(Time otherTime) {
        return !(lessOrEquals(otherTime));
    }

    public boolean greaterOrEquals(Time otherTime) {
        return !(lessThan(otherTime));
    }

    public String toMilitary() {
        return hrs + ":" + mins + ":" + secs;
    }

    public String toStandard() {
        String now = "AM";
        if (hrs >= 12) {
            now = "PM";
        }
        if (hrs > 12) {
            return (hrs - 12) + ":" + mins + ":" + secs + " " + now;
        }
        return (hrs) + ":" + mins + ":" + secs + " " + now;
    }

}