// my second completed java project!
// this program calculates the area of a traingle given 3 sides

import java.util.Scanner;
import java.lang.Math;


public class areaOfTriangle {
    public static void main(String[] args){

        double s,Area;
    Scanner keyboard = new Scanner(System.in); 

        System.out.print("Enter length of side a " );
            double a = keyboard.nextInt();

        System.out.print("Enter length of side b " );
            double b = keyboard.nextInt();

        System.out.print("Enter length of side c ");
            double c = keyboard.nextInt();

        s = (a+b+c)/2.0d;
        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));


        System.out.format("Area of traingle is = %.3f\n", Area);
    }
    
}
