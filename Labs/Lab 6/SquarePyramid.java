public class SquarePyramid implements Shape3D {
    private double Length;
    private double Height;

    public SquarePyramid() {
        Length = 0;
        Height = 0;
    }

    public SquarePyramid(double L, double H) {
        if (L >= 0) {
            Length = L;
        }
        if (H >= 0) {
            Height = H;
        }
    }

    public double getLength() {
        return Length;
    }

    public double getHeight() {
        return Height;
    }

    public void setLength(double L) {
        if (L >= 0) {
            Length = L;
        }
    }

    public void setHeight(double H) {
        if (H >= 0) {
            Height = H;
        }
    }

    public void set(double L, double H) {
        setLength(L);
        setHeight(H);
    }

    public SquarePyramid getCopy() {
        return new SquarePyramid(Length, Height);
    }

    public void copy(SquarePyramid sp) {
        Length = sp.Length;
        Height = sp.Height;
    }

    public double getArea() {
        return Length * (Length + Math.sqrt(Length * Length + 4 * Height * Height));
    }

    public double getVolume() {
        return Length * Length * Height / 3.0;
    }

    public String toString() {
        return "Length: " + Length + " Height: " + Height;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SquarePyramid)) {
            return false;
        }
        SquarePyramid sp = (SquarePyramid) obj;
        return Length == sp.Length && Height == sp.Height;
    }
}
