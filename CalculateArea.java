/*
Write a menu driven program to find the area of circle, square, rectangle, and triangle

 */
import java.util.Scanner;

public class CalculateArea
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter option from below of which area you want to calculate");
        System.out.println(" 1.Rectangle \n 2.Square \n 3.Triangle \n 4.circle");
        byte choice = sc.nextByte();

        switch (choice)
        {
            case 1 :
                System.out.println("Enter length of rectangle");
                short lengthRectangle  = sc.nextShort();
                System.out.println("Enter width of rectangle");
                short widthRectangle = sc.nextShort();
                System.out.println("Area of given rectangle is : "+(lengthRectangle*widthRectangle));
                break;

            case 2 :
                System.out.println("Enter length of side of square ");
                short lengthSquare = sc.nextShort();
                System.out.println("Area of given square is : "+(lengthSquare*lengthSquare));
                break;

            case 3 :
                System.out.println("Enter height of triangle ");
                short heightTriangle  = sc.nextShort();
                System.out.println("Enter base of triangle");
                short baseTriangle  = sc.nextShort();
                System.out.println("Area of given triangle is : "+((heightTriangle*baseTriangle)/2));
                break;

            case 4 :
                System.out.println("Enter radius of circle");
                short radius = sc.nextShort();
                System.out.println("Area of circle with radius "+radius+" is : "+(3.14f*radius*radius));
                break;

            default :
                System.out.println("Choose correct option");
        }



    }
}
