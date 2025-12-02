import java.util.Scanner;

/**
 * Write a description of class divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisible
{
    public static void main(String[] args){
            Scanner abc = new Scanner(System.in);
            System.out.println("Enter a number");
            int a = abc.nextInt();
            abc.nextLine();
            
            System.out.println("The number is:\t" +a);
            
            if (a % 3 == 0 && a % 5==0) {
                System.out.println("The number is divisible by both 3 and 5");
            }
            else{
                System.out.println("The number is not divisible by both 3 and 5");
            }
            
            
    }
}