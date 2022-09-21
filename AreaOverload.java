//Write a Area method as overloaded method, and find the area of circle, square, rectangle and triangle.

import java.util.Scanner;

public class AreaOverload
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        byte  choice  = -1;

        while(choice!=0)
        {
            System.out.println("choose from below options");
            System.out.println("1.area of circle");
            System.out.println("2.area of triangle");
            System.out.println("3.area of square");
            System.out.println("4.area of rectangle");
            System.out.println("0 to exit application");
            choice = sc.nextByte();

            switch(choice)
            {
                case(1)->{
                    System.out.println("Enter radius of circle");
                    int radius  = sc.nextInt();
                    System.out.println("---------------------------------------------------");
                    System.out.println("Area of circle is : "+Area.getArea(radius));
                    System.out.println("---------------------------------------------------");
                }

                case(2)->{
                    System.out.println("Enter base of triangle");
                    short base = sc.nextShort();
                    System.out.println("Enter height of triangle");
                    short height  = sc.nextShort();

                    System.out.println("---------------------------------------------------");
                    System.out.println("Area of triangle is : "+Area.getArea(base,height));
                    System.out.println("---------------------------------------------------");
                }

                case(3)->{
                    System.out.println("Enter side of square");
                    short side = sc.nextShort();

                    System.out.println("---------------------------------------------------");
                    System.out.println("Area of square is : "+Area.getArea(side));
                    System.out.println("---------------------------------------------------");
                }

                case(4)->{
                    System.out.println("Enter length of rectangle");
                    int length = sc.nextInt();
                    System.out.println("Enter width of rectangle");
                    int width = sc.nextInt();
                    System.out.println("---------------------------------------------------");
                    System.out.println("Area of rectangle is : "+Area.getArea(length,width));
                    System.out.println("---------------------------------------------------");
                }
                case(0)->{
                    System.out.println("---------------------------------------------------");
                    System.out.println("Thanks for using the application");
                    System.out.println("---------------------------------------------------");
                }
                default->{
                    System.out.println("---------------------------------------------------");
                    System.out.println("please choose correct option");
                    System.out.println("---------------------------------------------------");
                }
            }

        }
    }
}

class Area
{
    // circle
    public static float getArea(int radius)
    {
        return 3.14f*radius*radius;
    }

    //triangle
    public static float getArea(short base, short height)
    {
        return (base*height/2f);
    }

    //rectangle
    public static int getArea(int length,int width)
    {
        return length*width;
    }

    //square
    public static int getArea(short side)
    {
        return side*side;
    }
}
