package JAVA;
import java.util.Scanner;

public class OOP3{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int R;
        System.out.println("Enter the radius of the Sphere : ");
        R = sc.nextInt();
        float pi = 3.14f;

        System.out.println("The Volume of the sphere is " + (4/3*pi*R*R*R));
    }
}
