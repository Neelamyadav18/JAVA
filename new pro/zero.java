import java.util.*;
public class zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num > 0 ) System.out.println("print positive");
        else if (num<0) System.out.print(" print negative ");
        else System.out.println("print zero");
    }
}