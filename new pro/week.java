import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the week days = ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("monday");
                break;
            case 7: System.out.println("saturday");
                break;
            default: System.out.println("invalid day");
                
        }
    }
    
}
