import java.util.Scanner;

public class button2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        sc.close();
        switch (button) {
            case 1: System.out.println("press hello");
                 break;
             case 2 : System.out.println("press nameste");
                break;
             case 3 : System.out.println("bonjour");
                break;
             default: System.out.println("invalid ");
                
        }

    }
    
}
