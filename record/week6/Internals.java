package CIE;

import java.util.Scanner;

public class Internals extends Student {
   private int[] internalMarks;

   public Internals(String var1, String var2, int var3, int[] var4) {
      super(var1, var2, var3);
      this.internalMarks = var4;
   }

   public void displayInternalMarks() {
      System.out.println("Internal Marks: ");

      for(int var1 = 0; var1 < this.internalMarks.length; ++var1) {
         System.out.println("Course " + (var1 + 1) + ": " + this.internalMarks[var1]);
      }

   }

   public int calculateInternalTotal() {
      int var1 = 0;
      int[] var2 = this.internalMarks;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         var1 += var5;
      }

      return var1;
   }

   public static int[] takeInternalMarksInput() {
      Scanner var0 = new Scanner(System.in);
      int[] var1 = new int[5];
      System.out.println("Enter internal marks for 5 courses: ");

      for(int var2 = 0; var2 < var1.length; ++var2) {
         System.out.print("Course " + (var2 + 1) + ": ");
         var1[var2] = var0.nextInt();
      }

      return var1;
   }
}