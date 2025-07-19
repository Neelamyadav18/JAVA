import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value a = ");
        int a = sc.nextInt();
        int cube = (a*a*a);
        sc.close();
        System.out.print("print cube value = " + cube);

    
}
}