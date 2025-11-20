import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[] args){
    Scanner waterlevel = new Scanner(System.in);
    
    System.out.println("Enter current water level:");
    int l = waterlevel.nextInt();
         System.out.println("Current water level:"+l);
         String isValid =( l <= 1000)? "Status:Normal" : "WARNING: Water level has reached 1000L";
         System.out.println(isValid);
    
    }
}