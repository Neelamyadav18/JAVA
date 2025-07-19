import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 50;
        if (n%2==0) {
            System.out.print(" even number :" +n);
         }
         else if (n<=x) {
            System.out.println("odd no" + n);

            
         }
         else {

            System.out.println("invalid number");
         }

         }
    }

    

