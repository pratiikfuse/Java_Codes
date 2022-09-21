import java.util.Scanner;

public class CarOOP
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how many cars you have");
        int carsCount  = sc.nextInt();
        sc.nextLine();

        Car[] arr = new Car[carsCount];

        for(int i = 0;i<carsCount;i++)
        {
            System.out.println("Enter details of car "+(i+1));
            System.out.println("Enter car color");
            String color  = sc.nextLine();

            System.out.println("Enter car mileage in km/litre");
            byte mileage  = sc.nextByte();

            System.out.println("Enter car number");
            short numberPlate = sc.nextShort();
            sc.nextLine();

            System.out.println("Enter car company");
            String carCompany = sc.nextLine();

            arr[i] = new Car(color,mileage,numberPlate,carCompany);
        }

        System.out.println("Car details");
        for(Car c  : arr)
        {
            System.out.println(c);
        }

    }
}

class Car {
    private String color;
    private byte mileage;
    private short numberPlate;
    private String carCompany;

    public Car() {
    }


    public Car(String color, byte mileage, short numberPlate, String carCompany) {
        this.color = color;
        this.mileage = mileage;
        this.numberPlate = numberPlate;
        this.carCompany = carCompany;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getMileage() {
        return mileage;
    }

    public void setMileage(byte mileage) {
        this.mileage = mileage;
    }

    public short getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(short numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String toString()
    {
        return "[carCompany="+this.carCompany+","+"numberPlate="+this.numberPlate+","+"color="+this.color+","+"mileage="+this.mileage+"km/Litre]";
    }
}