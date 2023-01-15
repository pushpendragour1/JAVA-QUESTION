package JavaBasic;
import java.util.Scanner;
//
public class AreaOfEquilateral {
    public static void main(String[] args) {
        System.out.print("Enter the Area :  ");
        Scanner input = new  Scanner(System.in);
        double area = input.nextInt();
        double ans = (1.73*area*area)/4;
        System.out.println("The Area of equilateral Triangle is : " + ans);

        
    }
    
}
