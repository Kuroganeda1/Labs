public class Point {
    int x,y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point( int ix, int iy){
        x = ix;
        y = iy;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int ix){
        if (ix > 0)
            x = ix;
        else {
            System.out.println("Not an integer! Try again!");
        } 
    }

    public void setY(int iy){
        if (y > 0)
            y = iy;
        else {
                System.out.println("Not an integer! Try again!");
        }
    }

    public void set(int ix, int iy){
        setX(ix);
        setY(iy);
    }

    public String print(){
        return "( "+ x + ", " + y + ")";
    }

    public String toString(){
        return "X: " + x + "\nY: " + y;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Point))
            return false;

        Point p =  (Point) obj;
        return x == p.getX() && y == p.getY();
    }

    public void translate(int xc, int yc) {
        
        x += xc;
        y += yc;
    }

    public void copy(Object obj) {
        if (!(obj instanceof Point ))
            return;
        Point p = (Point) obj;
        set(x, y);
    }

    public Point getCopy(){
        return new Point(x, y);
    }

    public double distanceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p1){
        
        double dx = p1.getX() - x;
        double dy = p1.getY() - y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean isHorizontal(Point p1){
        if (!(p1.getY() == y))
            return false;

            return true;
    }

    public boolean isVertical(Point p1){
        if (!(p1.getX() == x))
            return false;

            return true;
    }

    public String slope(Point p1){
        double dx = p1.getX() - x;
        double dy = p1.getY() - y;

        return dx + "/" + dy;
    }
}
