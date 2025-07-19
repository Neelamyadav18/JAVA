import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        System.out.print(  "Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int i = 10;
        int n = 23;
        
        while (i < n) {
        
            if(i%2==0){
            
           
           System.out.println("odd value is : " + i );

        }
        else {
               System.out.println("even value is : " + i );
               
        }
           i=i+1;
            
        }

    }
}
