public abstract class CircularShapeWithHeight extends CircularShape {
    private double Height;

    public CircularShapeWithHeight() {
        super();
        Height = 0;
    }

    public CircularShapeWithHeight(double R, double H) { // Using R, H for input radius, height
        super(R);
        setHeight(H);
    }

    public void setHeight(double H) { // Using H for input height
        if (H >= 0) { // Assuming height cannot be negative
            Height = H;
        }
    }

    public double getHeight() {
        return Height;
    }

    public String toString() {
        return super.toString() + " Height: " + Height;
    }

    public boolean equals(Object Obj) { 
        if (!(Obj instanceof CircularShapeWithHeight)) {
            return false;
        }
        CircularShapeWithHeight Csh = (CircularShapeWithHeight) Obj; 
        return super.equals(Obj) && Height == Csh.Height;
    }
}