import java.util.Scanner;
import java.lang.Math;

public class distanceBetweenXY {
    public static void main(String[] args){

        double distance;
    Scanner keyboard = new Scanner(System.in); 
  
        System.out.print("Enter value for x1: ");
           double x1 = keyboard.nextInt();
   
       System.out.println("Enter value for x2: ");
        double x2 = keyboard.nextInt();
    
      System.out.println("Enter value for y1: ");
        double y1 = keyboard.nextInt();
  
      System.out.println("Enter value for y2: ");
          double y2 = keyboard.nextInt();
    
      distance=Math.sqrt((x2-x1) * (x2-x1) + (y2-y1)* (y2 - y1));
         System.out.println("Your distance is: " + distance);   
        }


    }

