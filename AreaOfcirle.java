package JavaBasic;
import java.util.Scanner;
import java.lang.Integer;

//To find the Area of square:
public class AreaOfcirle{

    public static void main(String[] args)
    {
       System.out.print("Enter the Radius of the circle : ");
        Scanner input = new  Scanner(System.in);
        double radius = input.nextInt();
        double pi = 3.14;
        double areaSquare = pi* radius*2;
        System.out.println("The Area of the square of the number is :  " + areaSquare);
        System.out.println("Would you like to find  Perimeter Of Equilateral Triangle : ");
        System.out.print(" Enter area of the square otherwise q for Quit : ");
        String choice = input.next();
        if(!choice.equals("q"))
        {
            Integer AreaSquare = Integer.parseInt(choice);
            int ans = 3 * AreaSquare;
            System.out.println("The Area of the square of the number is :  " + areaSquare);
            System.out.println("The Perimeter Of Equilateral Triangle :   " + ans);
        }
        else
        {
            System.out.println(" Ohk your Quit : " );
        }
    }
}