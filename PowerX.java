//Find the x to power y using recursion. (both x and y take input from user)

import java.util.Scanner;

public class PowerX {
    public static int power(int x,int y)
    {
        if(y>=1){
            return x*power(x,--y);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of base");
        int base = sc.nextInt();
        System.out.println("Enter value of exponent");
        int exponent = sc.nextInt();

        System.out.println(base+" raised to "+exponent+" is ");
        System.out.println(PowerX.power(base,exponent));
    }
}
