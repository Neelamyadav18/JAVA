import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value =");
        int a = sc.nextInt();
        System.out.print("Enter the second value =");
        int b = sc.nextInt();
        System.out.print("Enter the thired value =");
        int c = sc.nextInt();
        float avg = (float)(a + b + c) / 3;
        System.out.println("Average of numbers is : "+avg);
        sc.close();
    }
    
}
