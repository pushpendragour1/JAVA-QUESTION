package JavaBasic;
import java.util.Scanner;
//Perimeter Of Circle

public class PerimeterOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter the Radius of the circle : ");
        Scanner input = new  Scanner(System.in);
        double radius = input.nextInt();
        double pi = 3.14;
        double ans = 2 * 3.14 *radius;
        System.out.println("The Perimeter Of Circle :  " + ans);
    
    }
    
}
