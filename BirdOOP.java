import java.lang.reflect.Field;
import java.util.Random;
import java.util.Scanner;

public class BirdOOP
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bird name");
        String birdName  = sc.nextLine();
        System.out.println("Enter bird sound");
        String sound  = sc.nextLine();
        System.out.println("Enter bird color");
        String color  = sc.nextLine();
        System.out.println("can this bird fly ? ");
        System.out.println("true for yes , false for no");
        boolean canFly  = sc.nextBoolean();

        Bird bird  = new Bird(birdName,sound,color,canFly);


        System.out.println("Nick name for your bird");
        System.out.println(bird.suggestNickName());

        System.out.println(bird);

    }
}

class Bird
{
    private String birdName;
    private String sound;
    private String color;
    private boolean canFly;

    public Bird()
    {

    }

    public Bird(String birdName,String sound,String color,boolean canFly)
    {
        this.birdName = birdName;
        this.sound = sound;
        this.color  = color;
        this.canFly = canFly;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    public String suggestNickName()
    {
        String[] arr = new String[]{"Angel", "Baby","BB","Buddy","Charlie","Coco","Daisy","Bob","Chintu","Chotu"};
        Random random = new Random();

        int i = random.nextInt(9);


        return arr[i];
    }
    public String toString()
    {
        return "[birdName="+this.birdName+","+"sound="+this.sound+","+"color="+this.color+","+"canFly="+this.canFly+"]";
    }
}
