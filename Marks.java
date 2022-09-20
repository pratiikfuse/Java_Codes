import java.util.Scanner;

public class Marks
{
    public static float getAverage(byte scienceMarks,byte mathMarks,byte englishMarks)
    {
        if(scienceMarks>100 || mathMarks>100 || englishMarks>100 || scienceMarks<0 || mathMarks<0 || englishMarks<0)
        {
            return -1;
        }

        return (scienceMarks+mathMarks+englishMarks)/3f;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Science");
        byte scienceMarks  = sc.nextByte();

        System.out.println("Enter marks of Math");
        byte mathMarks  = sc.nextByte();

        System.out.println("Enter marks of English");
        byte englishMarks  = sc.nextByte();

        float averageMarks = Marks.getAverage(scienceMarks,mathMarks,englishMarks);

        if(averageMarks == -1)
        {
            System.out.println("Please enter valid marks . constraint : 0 <= marks <= 100 ");
            sc.close();
            System.exit(0);
        }
        System.out.println("Average marks are : "+averageMarks);

        sc.close();

    }

}
