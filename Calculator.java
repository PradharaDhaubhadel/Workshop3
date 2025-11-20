import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[] args){
    Scanner number = new Scanner(System.in);
    
    System.out.println("First number:");
    int a = number.nextInt();
         System.out.println("My first number:"+a);
    System.out.println("Second number:");
    int b = number.nextInt();
         System.out.println("My first number:"+b);     
}
}