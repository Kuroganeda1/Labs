import java.util.Scanner;

public class Time_Client {

    public static void main(String[] args) {

        Time t1 = new Time(8, 15, 30);
        Time t2 = new Time();

        System.out.println("Military time: " + t1.toMilitary());
        System.out.println("Standard time: " + t1.toStandard());

        System.out.println("Military time: " + t2.toMilitary());
        System.out.println("Standard time: " + t2.toStandard());

        t2.set(9, 45, 35);
        System.out.println("Military time: " + t2.toMilitary());
        System.out.println("Standard time: " + t2.toStandard());

        if (t1.equals(t2)) {
            System.out.println("Times are equal.");
        } else {
            System.out.println("Times aren't equal.");
        }

        if (t1.lessThan(t2)) {
            System.out.println("T1 is less than t2.");
        } else {
            System.out.println("T1 isn't less than t2.");
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int h = keyboard.nextInt();

        System.out.print("Enter minutes: ");
        int m = keyboard.nextInt();

        System.out.print("Enter seconds: ");
        int s = keyboard.nextInt();
        keyboard.close();

        t1.set(h, m, s);
        System.out.println("New time t1 after call to setTime standard format: " + t1.toStandard());

        t1.advanceSecs();
        System.out.println("New time t1 after call to advanceSecs standard format: " + t1.toStandard());

        t2.copy(t1);
        System.out.println("New t2 after call to copy standard format: " + t2.toStandard());

        System.out.println("Test toString for t2: " + t2.toString());

        // Try invalid inputs
        System.out.println("\nTesting invalid inputs:");
        t1.set(-5, 61, 70);
        System.out.println(t1.toMilitary());
    }
}
