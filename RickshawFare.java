import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author Pradhara Dhaubhadel
 * @version v1
 */
public class RickshawFare
{
    public static void main(String[] args){
    
        Scanner fare = new Scanner(System.in);
        
        System.out.println(".......WELCOME TO RICKSHAW FARE.........");
        
        System.out.println("Are you local and need to travel long distance?(true / false)");
        boolean ans = fare.nextBoolean();
        
        System.out.println("Are you travelling during night?(true / false)");
        boolean answer = fare.nextBoolean();
        
        System.out.println("Enter the distance you want to travel(in km)");
        float distance = fare.nextFloat();
        fare.nextLine();
        
        System.out.println("Enter the time(in min)");
        int time = fare.nextInt();
        fare.nextLine();
        
        float forDistance = 100 * distance;
        float fortime = 15 * time;
        float total = forDistance + fortime;
        float discount = total - 100;
        float night = total + 20;
        float finaltotal = night - 100;
        
        
        System.out.println("\n");
        System.out.println(".......Your Total For The RICKSHAW FARE.......");
        System.out.println("Distance:\t"+distance+"km");
        System.out.println("Time:\t\t"+time+"min");
        
        String isAns =( ans == true)? "YOU GOT A DISCOUNT OF Rs 100!!\nTotal is :\tRs "+discount: "Total:\t\tRs " +total;
        System.out.println(isAns);
        
        String isNight =( answer == true) && (ans == true)? "There is a surchage for night time travel of Rs 20.\nFinal Total:\tRs "+finaltotal : " ";
        System.out.println(isNight);
        
        String isValid = ( answer == true) && (ans == false)? "There is a surchage for night time travel of Rs 20.\nFinal Total:\tRs " +night : " ";
        System.out.println(isValid);
    
        System.out.println("SAFE TRAVELS!!\nTHANK YOU FOR VISITING US!!");
        System.out.println(".............................................");
            
    }
}