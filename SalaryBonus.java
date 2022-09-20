/*Write a Java program for bonus calculation. Accept basic salary from user.
Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary.
If basic >= 20,000 then give 10% bonus otherwise give 20% bonus on basic salary.
Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)
 */
import java.util.Scanner;

public class SalaryBonus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter basic salary");
        int salary = sc.nextInt();

        if(salary<=0)
        {
            System.out.println("Enter correct salary");
            System.exit(0);
        }
        int TA,DA,HRA,PF,Bonus;

        TA = (salary*10)/100;
        DA = (salary*15)/100;
        HRA =(salary*20)/100;
        PF = (salary*12)/100;

        if(salary >= 20000)
        {
            Bonus = (salary*10)/100;
            System.out.println("Congratulations You got 10% bonus");
            System.out.println("your gross salary is : "+((salary+TA+DA+HRA+Bonus)-PF));
        }
        else
        {
            Bonus = (salary*20)/100;
            System.out.println("Congratulations you got 20% bonus");
            System.out.println("your gross salary is : "+((salary+TA+DA+HRA+Bonus)-PF));
        }

    }
}
