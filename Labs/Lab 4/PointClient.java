
    import java.util.Scanner;

public class PointClient {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        Point p1 = new Point();
        Point p2 = new Point(7, 13);
        Point p3 = new Point(7, 15);

        System.out.println("First point is " + p1.print());
        System.out.println("Second point is " + p2.print());
        System.out.println("Third point is " + p3.print());

        if (p2.isVertical(p3)) {
            System.out.println("Second point " + p2.print() + " lines up vertically with third point " + p3.print());
        } else {
            System.out.println("Second point " + p2.print() + " doesn't line up vertically with third point " + p3.print());
        }

        if (p2.isHorizontal(p3)) {
            System.out.println("Second point " + p2.print() + " lines up horizontally with third point " + p3.print());
        } else {
            System.out.println("Second point " + p2.print() + " doesn't line up horizontally with third point " + p3.print());
        }

        int x = readPositiveInteger(input, "Enter the x coordinate for first point: ");
        int y = readPositiveInteger(input, "Enter the y coordinate for first point: ");
        p1.set(x, y);

        System.out.println("First point (after call to set) is " + p1.print());

        System.out.printf("Distance from origin for first point = %.2f\n", p1.distanceFromOrigin());
        System.out.printf("Distance from origin for second point = %.2f\n", p2.distanceFromOrigin());
        System.out.printf("Distance between first point and second point = %.2f\n", p1.distance(p2));

        p1.translate(5, 10);
        p2.translate(15, 5);

        System.out.println("First point (after call to translate (5, 10)) is " + p1.print());
        System.out.println("Second point (after call to translate (15, 5)) is " + p2.print());

        if (p1.equals(p2)) {
            System.out.println("Call to equals: The 2 points are equal.");
        } else {
            System.out.println("Call to equals: The 2 points are NOT equal.");
        }

        System.out.println("Calls to copy and print");
        p1.copy(p3);
        p2.copy(p3);

        System.out.println("First point (after call to copy) is " + p1.print());
        System.out.println("Second point (after call to copy) is " + p2.print());

        if (p1.equals(p2)) {
            System.out.println("Call to equals after call to copy: The 2 points are equal.");
        } else {
            System.out.println("Call to equals after call to copy: The 2 points are NOT equal.");
        }

        input.close();
    }

    public static int readPositiveInteger(Scanner input, String prompt) {
        int val = -1;
        while (val <= 0) {
            System.out.print(prompt);
            if (!input.hasNextInt()) {
                input.next();
                System.out.println("Not an integer! Try again!");
                continue;
            }
            val = input.nextInt();
            if (val <= 0) {
                System.out.println("ERROR! Should be positive.");
            }
        }
        return val;
    }
}


