import java.util.Scanner;

class Student {
  String usn, name;
  int[] credits = new int[8];
  int[] grade = new int[8];
  int[] marks = new int[8];

  void details(Scanner s) {
    System.out.println("enter name, usn:");
    usn = s.next();
    name = s.next();
    System.out.println("enter marks of 8 subjects and their respective credits:");
    for (int i = 0; i < 8; i++) {
      System.out.println("enter marks:");
      marks[i] = s.nextInt();
      System.out.println("enter credits:");
      credits[i] = s.nextInt();
    }
  }

  void display() {
    System.out.println("name = " + name + ", usn = " + usn);
  }

  void grades() {
    for (int i = 0; i < 8; i++) {
      if (marks[i] >= 90){
        grade[i] = 10;}
      else if (marks[i] >= 80 && marks[i] < 90){
        grade[i] = 9;}
      else if (marks[i] >= 70 && marks[i] < 80){
        grade[i] = 8;}
      else if (marks[i] >= 60 && marks[i] < 70){
        grade[i] = 7;}
      else if (marks[i] >= 50 && marks[i] < 60){
        grade[i] = 6;}
      else if (marks[i] >= 40 && marks[i] < 50){
        grade[i] = 5;}
      else if (marks[i] >= 30 && marks[i] < 40){
        grade[i] = 4;}
      else if (marks[i] >= 20 && marks[i] < 30){
        grade[i] = 3;}
      else if (marks[i] >= 10 && marks[i] < 20){
        grade[i] = 2;}
      else if (marks[i] >= 0 && marks[i] < 10){
        grade[i] = 1;}
      else{
        grade[i] = 0;}
    }
  }

  void sgpa() {

    float a = 0, b = 0;
    for (int i = 0; i < 8; i++) {
      a = a + grade[i] * credits[i];
    }
    for (int i = 0; i < 8; i++) {
      b = b + credits[i];
    }
    float sgpa = a / b;
    System.out.printf("sgpa = %.2f", sgpa);
    System.out.println(" ");
  }
}

class Students {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Student[] stud = new Student[3];
    for (int i = 0; i < 3; i++) {
      stud[i] = new Student();
      stud[i].details(s);
      stud[i].display();
      stud[i].grades();
      stud[i].sgpa();
    }
  }
}
