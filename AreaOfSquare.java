package JavaBasic;

//Area Of Circle Java Program in java
import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the radius : ");
        double radius = input.nextDouble();
        double pi = 3.14;
        double area = pi *( radius*radius);
        System.out.println(" The area of the Circle  : " + area);
        

    }
    
}
