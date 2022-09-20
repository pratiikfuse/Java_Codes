//Enter distance in meter and convert it into km.

import java.util.Scanner;
public class MeterToKilometer
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter distance in meter");

        System.out.println("Distance in km is "+(sc.nextInt()/1000f));
    }
}
