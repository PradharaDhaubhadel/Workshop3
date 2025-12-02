import java.util.Scanner;

/**
 * Write a description of class divisibleNum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisibleNum
{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n = number.nextInt();
        number.nextLine();
        
        System.out.println("Number:/t"+n);
        if (n % 3 == 0)
          {
              if(n % 5 == 0){
                  System.out.println("Divisible by both 3 and 5");
              } 
              else{
                  System.out.println("Divisible by 3 but not divisible by 5");
              }
            }
          else if(n % 5 ==0){
              if(n % 3 == 0){
                  System.out.println("Divisible by both 3 and 5");
              } 
              else{
                  System.out.println("Divisible by 5 but not divisible by 3");
              }
          }
          else{
              System.out.println("Not divisible by both 3 and 5");
          }
        
        
    }
}