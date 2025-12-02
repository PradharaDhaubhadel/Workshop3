import java.util.Scanner;

/**
 * Write a description of class number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number
{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter a  number");
        int n = num.nextInt();
        num.nextLine();
        
        if(n>0){
            System.out.println("The number is positive");
        }
        else if(n == 0){
            System.out.println("The number is zero");
        }
        else{
            System.out.println("The is negative");
        }
        
    }
}