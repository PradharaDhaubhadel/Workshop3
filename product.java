import java.util.Scanner;

/**
 * Write a description of class product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class product
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
        
        if(ans == 'A'|| ans == 'a'){
            float a1 = price-(price*0.60f);
            System.out.println("Price:\t Rs."+a1);
    
        }
        else if(ans == 'B' || ans == 'b'){
            float b1 = price-(price*0.40f);
            System.out.println("Price:\t Rs."+b1);
        }
        else if(ans == 'C' || ans == 'c'){
            float c1 = price-(price*0.20f);
            System.out.println("Price:\t Rs."+c1);
            
        }
        else{
            float d1 = price-(price*0.10f);
            System.out.println("Price:\t Rs."+d1);
        }        
    } 
}