package JavaBasic;
import java.util.Scanner;

//Perimeter Of Equilateral Triangle
public class PerimeterOfEquilateral {
    public static void main(String[] args) {
        System.out.print("Enter the area of the circle : ");
        Scanner input = new  Scanner(System.in);
        double a = input.nextInt();
        double ans = 3 *a;
        System.out.println("The Perimeter Of Equilateral Triangle :  " + ans);
    }
    
}
