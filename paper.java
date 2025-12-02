import java.util.Scanner;

/**
 * Write a description of class paper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class paper
{
    public static void main(String[] args){
        Scanner kagaz = new Scanner(System.in);
        
        System.out.println("Enter the paper size from 0 to 5");
        int ans = kagaz.nextInt();
        kagaz.nextLine();
        
        switch(ans){
        case '0':
            System.out.println("A0: 841 x 1189 mm (33.1 x 46.8 inches)");
            break;
        case '1':
            System.out.println("A1: 594 x 841 mm (23.4 x 33.1 inches)");
            break;
        case '2':
            System.out.println("A2: 420 x 594 mm (16.5 x 23.4 inches)");
            break;
        case '3':
            System.out.println("A3: 297 x 420 mm (11.7 x 16.5 inches)");
            break;
        case '4':
            System.out.println("A4: 210 x 297 mm (8.3 x 11.7 inches)");
            break;
        case '5':
            System.out.println("A5: 148 x 210 mm (5.8 x 8.3 inches)");
            break;
        default:
            System.out.println("Invalid size");
            
        }
    }
}