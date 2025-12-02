import java.util.Scanner;

/**
 * Write a description of class items here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class items
{
    public static void main(String[] args){
        Scanner items = new Scanner(System.in);
        
        System.out.println("Enter the marked price");
        float price = items.nextFloat();
        
        System.out.println("Enter the discount category (A,B,C,D)");
        char ans = items.next().charAt(0);
        
        System.out.println("\n");
        System.out.println("Mrp:\t Rs." +price);
        System.out.println("Category:\t" +ans);
        
        
        float a = price-(price*0.60f);
        float b = price-(price*0.40f);
        float c = price-(price*0.20f);
        float d = price-(price*0.10f);
        
        switch(ans){
        case 'A':
            System.out.println("Price:\t Rs." + a);
            break;
        case 'B':
            System.out.println("Price:\t Rs." + b);
            break;
        case 'C':
            System.out.println("Price:\t Rs." + d);
            break;
        case 'D':
            System.out.println("Price:\t Rs." + d);
            break;
        default:
            System.out.println("The category you have selected in invalid. Select another category");
            
        }
}
}
