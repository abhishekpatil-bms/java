package CIE;

public class Student {
   protected String usn;
   protected String name;
   protected int sem;

   public Student(String var1, String var2, int var3) {
      this.usn = var1;
      this.name = var2;
      this.sem = var3;
   }

   public void displayDetails() {
      System.out.println("USN: " + this.usn);
      System.out.println("Name: " + this.name);
      System.out.println("Semester: " + this.sem);
   }
}

