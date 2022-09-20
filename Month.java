/*Write a program to convert given number of days into months and remaining days.
        (Consider one month = 30 days ) (eg. I/p : days = 122 o/p : 4 months and 2 days)

 */

import  java.util.Scanner;

public class Month
{
    public static short[] getMonthDays(short days)
    {
        final byte MONTH_DAYS = 30;

        short month = (short) (days/MONTH_DAYS);

        short remainDays = (short) (days%MONTH_DAYS);

        return new short[]{month,remainDays};

    }

    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter days");
        short days = sc.nextShort();

        short[] arr  = Month.getMonthDays(days);

        System.out.println(arr[0]+" months and "+arr[1]+" days");

        sc.close();
    }
}
