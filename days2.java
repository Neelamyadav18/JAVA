import java.util.*;
public class days2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();
        switch(day){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thrusday");
            break;
            case 5: System.out.println("Friday");
            default : System.out.println("invalid days");
        }
     }

    
}
