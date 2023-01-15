package JavaBasic;
import java.util.Scanner;

//Area Of Isosceles Triangle

public class AreaOfIsosceles{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.print(" Enter the base : ");//input base 
       double base = input.nextDouble();

       System.out.print(" Enter the HIGHT : ");//input height
       double hight = input.nextDouble();
        double ans = (base * hight)/2 ;
         System.out.println("The Area of Isosceles Triangle : " + ans);
    }
}