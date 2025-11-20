import java.util.Scanner;

/**
 * Write a description of class Introduction here.
 *
 * @author Pradhara Dhaubhadel
 * @version v1
 */
public class Introduction
{
    public static void main(String[] args){
         System.out.println("My name is: Pradhara");
         
         Scanner name = new Scanner(System.in);
         System.out.println("Your name:");
         
         String yourName = name.nextLine();
         System.out.println("Your name:" + yourName);
        }
}