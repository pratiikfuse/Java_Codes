//Write a Java program to print the area and perimeter of a circle

import java.util.Scanner;

public class Circle
{
    ;

    public static float getArea(short radius)
    {
        return (float)(Math.PI*radius*radius);
    }
    public static float getPerimeter(short radius)
    {
        return (float)(2*Math.PI*radius);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius of circle");
         short radius  =sc.nextShort();

        System.out.println("Area of Circle with radius "+radius+" is : "+Circle.getArea(radius));

        System.out.println("Perimeter of Circle with radius "+radius+" is : "+Circle.getPerimeter(radius));

        sc.close();

    }
}
