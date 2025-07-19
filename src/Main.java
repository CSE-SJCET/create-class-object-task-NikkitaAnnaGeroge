     // TODO: Create a class called Student with name, rollNumber, and grade

    // TODO: Create a method to display student details
public class Main {
      public static void main(String[] args) {
        Student student=new Student();
           student.name="Nikkita";
           student.rollNumber=57;
           student.grade='A';
           student.displayDetails();
      }
}
public class Student{
String name;
int rollNumber;
char grade;
public void displayDetails(){
          System.out.println("name:" +name);
          System.out.println("rollNumber:" +rollNumber);
          System.out.println("grade:" +grade);
     
             
    }
}
