package person;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  name =sc.next();
        int age=sc.nextInt();
        char gender=sc.next().charAt(0);
        long uniRollNumber=sc.nextLong();
        String courseName=sc.next();
        Student s=new Student(name,age,gender,uniRollNumber,courseName);
        System.out.println(s.toString());
        s.introduction();

    }

}
