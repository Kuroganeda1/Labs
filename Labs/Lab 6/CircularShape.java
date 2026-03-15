public abstract class CircularShape implements Shape3D {

    private double radius;

    public CircularShape() {
        radius = 0;
    }

    public CircularShape(double iRadius) {
        set(iRadius);
    }

    public void set(double iRadius) {
        if (iRadius >= 0)
            radius = iRadius;
    }

    public double get() {
        return radius;
    }

    public double getDia() {
        return 2 * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerim() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Radius: " + radius;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CircularShape))
            return false;
        CircularShape c = (CircularShape) obj;
        return radius == c.radius;
    }

    public boolean notEquals(CircularShape c) {
        return !(equals(c));
    }

    public void copy(Object obj) {
        if (!(obj instanceof CircularShape))
            return;
        CircularShape c = (CircularShape) obj;
        set(c.radius);
    }

    public CircularShape getCopy() {
        return this; // to override in concrete subclass
    }
}