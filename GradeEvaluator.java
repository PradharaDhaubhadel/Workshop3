import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] args){
    
        Scanner grade = new Scanner(System.in);
        
        System.out.println("Enter your numeric grade");
        int Grade = grade.nextInt();
        grade.nextLine();
        
        if( Grade >= 40){
            System.out.println("The grade you have got is:\nPass!");
        }
        else{
            System.out.println("The grade you have got is:\nFail");
        }
        
    }
}