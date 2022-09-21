import java.util.Scanner;
public class SchoolOOP
{
    public static void main(String[] args) {
     //   Student student = new Student("pratik",163314,true);
       // Teacher teacher = new Teacher("xyz","Math",16000,(byte)1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name");
        String name = sc.nextLine();
        System.out.println("Enter roll number");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.println("has "+name+" paid the fees ? if yes type true if no type false ");
        boolean feesPaid = sc.nextBoolean();
        sc.nextLine();

        Student student = new Student(name,rollNo,feesPaid);

        System.out.println("Enter teacher name ");
        name = sc.nextLine();
        System.out.println("Enter subject");
        String subject = sc.nextLine();
        System.out.println("Enter salary");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter teacher id");
        byte id = sc.nextByte();

        Teacher teacher = new Teacher(name,subject,salary,id);


        System.out.println("----------------------------------student details-----------------------------------------------");
        System.out.println("name : "+student.getName()+"\n"+"rollNo : "+student.getRollNo()+"\n"+"feesPaid : "+student.isFeesPaid());
        System.out.println("----------------------------------teacher details-----------------------------------------------");
        System.out.println("name:"+teacher.getName()+"\n"+"subject : "+teacher.getSubject()+"\n"+"salary : "+teacher.getSalary()+"\nID : "+teacher.getTeacherID());

    }
}

class Teacher
{
    private String name;
    private String subject;
    private int salary;

    public Teacher(String name, String subject, int salary, byte teacherID) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
        this.teacherID = teacherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public byte getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(byte teacherID) {
        this.teacherID = teacherID;
    }

    private byte teacherID ;
}
class Student
{
    private String name;
    private int rollNo;
    private boolean feesPaid;

    public Student(String name, int rollNo, boolean feesPaid) {
        this.name = name;
        this.rollNo = rollNo;
        this.feesPaid = feesPaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public boolean isFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(boolean feesPaid) {
        this.feesPaid = feesPaid;
    }
}
