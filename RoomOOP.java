//JAVA program to create a class Room having length, width and height as private data members,
// include functions to calculate area and volume of room. Create objects and call the methods.

import java.util.Scanner;

public class RoomOOP
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of room in meters");
        byte length = sc.nextByte();
        System.out.println("Enter width of room in meters");
        byte width = sc.nextByte();
        System.out.println("Enter height of room in meters");
        byte height = sc.nextByte();

        if(length<=0 || width<=0 || height<=0)
        {
            System.out.println("height/width/length should be positive and non-zero");
            System.exit(0);
        }
        Room r1  = new Room(length,width,height);

        System.out.println("Area of room is : "+ r1.getArea()+" square meters");
        System.out.println("Volume of room is : "+r1.getVolume()+" cubic meters");


    }
}

class Room
{
    private byte length;
    private byte width;
    private byte height;

    public Room()
    {

    }

    public Room(byte length,byte width,byte height)
    {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public byte getLength() {
        return length;
    }

    public void setLength(byte length) {
        this.length = length;
    }

    public byte getWidth() {
        return width;
    }

    public void setWidth(byte width) {
        this.width = width;
    }

    public byte getHeight() {
        return height;
    }

    public void setHeight(byte height) {
        this.height = height;
    }

    public int getArea()
    {
        return (this.length*this.width);
    }

    public int getVolume()
    {
        return (this.length*this.width*this.height);
    }
}