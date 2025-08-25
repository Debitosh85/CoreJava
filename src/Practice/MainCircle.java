package Practice;

import java.util.*;

class Circle {

    public static String getAreaofCircle(double area) {

        if (area <= 0) {

            return "Value Should be larger than 0:" + (-1);
        } else {

            double pi = 3.14;
            double areac = pi * area * area;
            return "radius is :" + areac;
        }

    }

}

public class MainCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for radius:");
        double radius = sc.nextDouble();

        String area = Circle.getAreaofCircle(radius);

        System.out.println(area);

        sc.close();

    }
}
