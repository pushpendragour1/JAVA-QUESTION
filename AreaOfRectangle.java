package JavaBasic;
import java.util.Scanner;
//Area Of Rectangle 
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the width : ");//input width 
        double width = input.nextDouble();

        System.out.print(" Enter the HIGHT : ");//input height
        double hight = input.nextDouble();

        double area = ( width * hight); // Formula of Area of rectangle width * higth!
        System.out.println(" The Area of Rectangle is  : " + area);
        
    }
    
}
