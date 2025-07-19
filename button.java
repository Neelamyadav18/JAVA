import java.util.Scanner;

public class button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button =  sc.nextInt();
        sc.close();
        if (button==1) {
            System.out.println("press good mornging");
        }
        else if (button==2) {
            System.out.println("press good afternoon");
            }
        else if (button==3) {
            
                System.out.println("press evening");
            }
        else {
            
                System.out.println("invalid press the button");

            }
    }
    
}
