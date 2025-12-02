import java.util.Scanner;

/**
 * Write a description of class Even_Odd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Even_Odd
{
    public static void main(String[] args){
        Scanner  num = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int a = num.nextInt();
        System.out.println("The number is:\t" +a);
        if (a%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        
        
    }
}