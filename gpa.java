import java.util.Scanner;

/**
 * Write a description of class gpa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gpa
{
    public static void main(String[] args){
        Scanner marks = new Scanner(System.in);
        
        System.out.println("Enter your gpa from 0.0 to 4.0");
        float gpa = marks.nextFloat();
        
        if ( gpa >= 1.6f){
            System.out.println("Grade:D");
        }
        else if(gpa >=2.0f){
            System.out.println("Grade:C"); 
        }
        else if(gpa >=2.4f){
            System.out.println("Grade:C+"); 
        }
        else if(gpa >=2.8f){
            System.out.println("Grade:B"); 
        }
        else if(gpa >=3.2f){
            System.out.println("Grade:B+"); 
        }
        else if(gpa >=3.6f){
            System.out.println("Grade:A"); 
        }
        else if(gpa >=4.0f){
            System.out.println("Grade:A+"); 
        }
        else{
            System.out.println("Error!");
        }
            
        }
    }
