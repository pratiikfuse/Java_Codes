/*
Write a program to input electricity unit charge and calculate the total electricity bill according to
        the given condition:
        For first 50 units Rs. 0.50/unit
        For next 100 units Rs. 0.75/unit
        For next 100 units Rs. 1.20/unit
        For unit above 250 Rs. 1.50/unit
        An additional surcharge of 20% is added to the bill.
 */
import java.util.Scanner;

public class CalculateElectricityBill
{
    public static float getFinalBill(int units)
    {
        float bill = 0.0f;
        if(units<0)
        {
            return -1;
        }
        if(units<=50)
        {
            bill = units*0.50f;
        }
        else if(units>=51 && units<=150)
        {
            bill =  50*0.50f + (units-50)*0.75f;
        }
        else if(units>=151 && units<=250)
        {
            bill =  50*0.50f + 100*0.75f + (units - 150)*1.20f;
        }
        else{
            bill =  50*0.50f + 100*0.75f + 100*1.20f + (units-250)*1.50f;
        }

        return (bill*120)/100 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter units");
        int units  = sc.nextInt();

        System.out.println("Your final bill to be paid is : "+CalculateElectricityBill.getFinalBill(units));


    }
}
