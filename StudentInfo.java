import java.util.Scanner;

/**
 * Write a description of class StudentInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentInfo
{
    public static void main(String[] args){
         
         Scanner data = new Scanner(System.in);
         System.out.println("Student  name:");
         System.out.println("Age:");
         System.out.println("GPA:");
         
         String Name = data.nextLine();
         System.out.println("Student name:" +Name);
         
         int age = data.nextInt();
         System.out.println("Age:"+age);
         
         double gpa = data.nextDouble();
         System.out.println("GPA:" + gpa);
         
        }
}