
/**
 * Write a description of class Tutorial4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial4
{
    public static void main(String[] args){
          int num;// declared variable is stored in stack memory
          num = 10; // value passed in variable, is stored in heap memory
          
          if (num >0)
          {
              System.out.println("This numberis positive");
          }
          else if(num == 0){
              System.out.println("This number is zero");
              
          }
          else {
              System.out.println("This number is negative");
            }
            
            
            
          int a = 15;
          if ( a % 3 == 0)
          {
              if(a % 5 == 0){
                  System.out.println("Divisible by both 3 and 5");
              } 
              else{
                  System.out.println("Divisible by 3 but not divisible by 5");
              }
            }
          else if(a % 5 ==0){
              if(a % 3 == 0){
                  System.out.println("Divisible by both 3 and 5");
              } 
              else{
                  System.out.println("Divisible by 5 but not divisible by 3");
              }
          }
          else{
              System.out.println("Not divisible by both 3 and 5");
          }
          // switch case
          
          int choice = 1;
          
          switch(choice)
          {
              case 1: System.out.println("Drink : Pepsi"); break;
              case 2: System.out.println("Drink : Sprite"); break;
              case 3: System.out.println("Drink : Fanta"); break;
              default: System.out.println("Not a valid choice");
              
          }
    }        
 }
          
        
