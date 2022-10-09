package Homework2;
import java.util.Scanner;
import java.lang.*;

public class leapYear {
    public static void main(String[] args){
        int year;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any year after 1582: ");
        year = scan.nextInt();

        System.out.println("Your year is " + year);

         if(year > 1582){
            if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
                System.out.println(year + " is a leap year");
            }  else{
                 System.out.println(year + " is not a leap year");
            }
          }
          else{
            System.out.println("Please input a year greater than 1582");
            System.out.print("Enter any year after 1582: ");
          }
            year = scan.nextInt();
            System.out.println("Your year is " + year);
           
            if(year > 1582){
                if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
                    System.out.println(year + " is a leap year");
                }  else{
                     System.out.println(year + " is not a leap year");
           
          }

      }
            else{
              System.out.println("The program will not run unless you select a year past 1582");
    }
}   
}