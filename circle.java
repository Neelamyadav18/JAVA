import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value redius = ");
        float r = sc.nextFloat();
        sc. close();
        float pi = 3.14f;
        float c = (2 * pi * r );
        System.out.print("area of circle is = " + c );
    
}
}
