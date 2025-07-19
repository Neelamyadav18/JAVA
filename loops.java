import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();
        for(int count=0; count<a; count=count+1 ){
            System.out.println("print count");
        }

    }
    
}
    
    
    
