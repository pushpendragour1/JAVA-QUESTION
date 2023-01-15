package JavaBasic;
import java.util.Scanner;

//Perimeter Of Parallelogram
public class PerimeterOfParallelogram {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print(" Enter the Base : ");//input Base 
       double base = input.nextDouble();

       System.out.print(" Enter the side : ");//input side
       double side = input.nextDouble();
       double ans = 2 * (base * side);
       System.out.println("The Perimeter Of Parallelogram : " + ans);
    }
    
}
