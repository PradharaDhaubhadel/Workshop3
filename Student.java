import java.util.Scanner;

/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    public static void main(String[] args){
    
        Scanner marks = new Scanner(System.in);
        
        System.out.println("Enter your grade");
        int grade = marks.nextInt();
        marks.nextLine();
        
        String ispass = (grade>=40)? "You have passed":"You have failed";
        System.out.println(ispass);
        
}
}