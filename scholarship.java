import java.util.Scanner;

/**
 * Write a description of class scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scholarship
{
    public static void main(String[] args){
    
        Scanner stud = new Scanner(System.in);
        
        System.out.println("Enter your gpa from 0.0 to 4.0");
        float gpa = stud.nextFloat();
        
        System.out.println("Enter your attendance in percentage");
        int attendance = stud.nextInt();
        stud.nextLine();
        
        System.out.println("Enter your attitude score");
        int attitude = stud.nextInt();
        stud.nextLine();
        
        if (gpa>= 3.2f)
          {
              if(attendance > 80){
                   if (attitude < 5){  
                  System.out.println("You are eligible for scholarship");
                   } 
                   else{
                  System.out.println("You are not eligible for scholarship");
                 }
              }
              else{
                 System.out.println("You are not eligible for scholarship");
              }
    }
    else{
        System.out.println("You are not eligible for scholarship");
    }
  }
}