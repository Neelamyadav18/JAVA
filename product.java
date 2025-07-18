import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a = sc.nextInt();
        System.out.print("Enter the second   number =");
        int b = sc.nextInt();

     sc.close();
        int product = (a*b);
        System.out.print("cal value of product = " + product);
}
}