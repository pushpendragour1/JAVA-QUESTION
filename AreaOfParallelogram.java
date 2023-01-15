package JavaBasic;
import java.util.Scanner;

//Area Of Parallelogram
public class AreaOfParallelogram {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.print(" Enter the base : ");//input base 
       double base = input.nextDouble();

       System.out.print(" Enter the HIGHT : ");//input height
       double hight = input.nextDouble();
       
       double ans = (base * hight);
       System.out.println("The Area Of Parallelogram : " + ans);
    }
    
}
