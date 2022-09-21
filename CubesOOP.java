//JAVA Program to display the cubes from 1 to a given n number using constructor.
import java.util.Scanner;

public class CubesOOP
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        byte number = sc.nextByte();

        Cube c1 = new Cube(number);
    }
}


class Cube
{
    private byte number;

    public Cube(byte number)
    {
        this.number = number;

        System.out.println("number "+"->"+" cube");

        for(byte i  = 1;i<=this.number;i++)
        {
            System.out.println(i+" -> "+(i*i*i));
        }
    }
}