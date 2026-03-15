public class Cylinder extends CircularShapeWithHeight {

    public Cylinder() {
        super();
    }

    public Cylinder(double R, double H) { 
        super(R, H);
    }

    
    public double getArea() {
        return getCrossSectionPerimeter() * getHeight() + 2 * getCrossSectionArea();
    }

    

    public double getCrossSectionArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getCrossSectionPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getHeight() {
        return super.getHeight();
    }

 public double getRadius() {
        return super.getRadius();
    }

    public void setHeight(double H) {
        super.setHeight(H);
    }
    public void setRadius(double R) {
        super.setRadius(R);
    }

    public void setAll(double R, double H) {
        super.setRadius(R);
        super.setHeight(H);
    }

    public double getVolume() {
        return getCrossSectionArea() * getHeight();
    }

    public String toString() {
        return "For this cylinder the radius = " + getRadius() + " and the height = " + getHeight();
    }

    public boolean equals(Object Obj) { // Using Obj for input object
        if (!(Obj instanceof Cylinder)) {
            return false;
        }
        Cylinder C = (Cylinder) Obj; // Using C for casted object
        return super.equals(Obj) && getRadius() == C.getRadius() && getHeight() == C.getHeight();
    }
}