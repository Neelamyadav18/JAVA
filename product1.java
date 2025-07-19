// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class product1 {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the first number = ");
      int var2 = var1.nextInt();
      System.out.print("Enter the second   number =");
      int var3 = var1.nextInt();
      var1.close();
      int var4 = var2 * var3;
      System.out.print("cal value of product = " + var4);
   }
}
