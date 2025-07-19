import java.util.Scanner;

public class con1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nu : ");
        int a = sc.nextInt();
         
             

        if (a%2==0 && a<=50) {

            System.out.print("even :" +a );
            }
        else{
            System.err.println("odd :" +a);
        }
             a=a+1;
    }
    
}
