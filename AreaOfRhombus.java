package JavaBasic;
import java.util.Scanner;

//Area Of Rhombus

public class AreaOfRhombus {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.print(" Enter the 1st diagonal of the rhombus: ");//input 2st diagonal 
       double d1 = input.nextDouble();

       System.out.print(" Enter the 2st diagonal of the rhombus : ");//input 2st diagonal
       double d2 = input.nextDouble();
       
       double ans =( d1 * d2 ) / 2; // It is a formula for calculating a area of rhombus   
       System.out.println("The Area Of Rhombus : " + ans);
    }
}
