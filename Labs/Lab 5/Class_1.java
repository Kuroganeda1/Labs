public class Class_1 {

    int x, y;

    public Class_1() {
        x = 0;
        y = 0;
    }

    public Class_1(int ix, int iy) {
        set(ix, iy);
    }

    public void print() {
        System.out.print(x + " " + y + " ");
    }

    public String toString() {
        return x + " " + y + " ";
    }

    public void set(int ix, int iy) {
        x = ix;
        y = iy;
    }
}
