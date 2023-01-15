package JavaBasic;

//Area Of Triangle
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the BASE : ");//input base 
        double base = input.nextDouble();

        System.out.print(" Enter the HIGHT : ");//input height
        double hight = input.nextDouble();

        double area = ( base * hight)/2;
        System.out.println(" The area of Triangle is : " + area);

    }
    
}
