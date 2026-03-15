public class Class_2 extends Class_1 {

    int z;

    public Class_2() {
        super();
        z = 0;
    }

    public Class_2(int ix, int iy, int iz) {
        super(ix, iy);
        z = iz;
    }

    public void print() {
        super.print();
        System.out.println(z);
    }

    public String toString() {
        return super.toString() + z;
    }

    public void set(int ix, int iy, int iz) {
        super.set(ix, iy);
        z = iz;
    }
}
