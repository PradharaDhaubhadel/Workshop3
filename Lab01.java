import java.util.Scanner;

/**
 * Write a description of class Lab01 here.
 *
 * @author Pradhara Dhaubhadel
 * @version v1
 */
public class Lab01
{
    int age = 20; //instance variable
    static int qty = 12; //static variable
    
    public static void main(String[] args){
         //int age; declaring the variable
         //age =18;  assigning the variable
         
         int quantity = 5; //declaring and assgning
         
         Scanner input = new Scanner(System.in); // here input is variable
         System.out.println("Enter first number");
         
         int FirstNum = input.nextInt();
         System.out.println("My first number:"+FirstNum);
         
         //for decimal double
         System.out.println("Enter second number");
         double secondNum = input.nextDouble();
         System.out.println("My second number:" + secondNum);
         
         //Ternery Operator
         int age;
         System.out.println("Ask for his/her age:");
         age = input.nextInt(); // input name of variable from scanner class
         String isValid =( age >= 18)? "Driving is allowed" : "Driving is not allowed";
         System.out.println(isValid);
         
         
             
    }
}