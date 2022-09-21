//JAVA Program to display the table of the given number using constructor.

import java.util.Scanner;

public class TableOOP
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number");
        byte num  = sc.nextByte();

        Table t1 = new Table(num);

    }
}

class Table
{
    private byte number;

    public Table(byte number)
    {
        this.number = number;

        System.out.println("Table of "+this.number+" is : ");
        for(byte i  = 1;i<=10;i++)
        {
            System.out.println(i*this.number);
        }
    }
}
