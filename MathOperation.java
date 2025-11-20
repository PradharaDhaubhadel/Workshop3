
/**
 * Write a description of class MathOperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperation
{
    public static void main(String[] args){
        // arthmetic operator
        int a = 3;
        int b = 7;
        int sum = a + b;
        System.out.println(sum);
        
        int c = 4;
        int d =8;
        int difference = d - c;
        System.out.println(difference);
        
        int e = 3;
        int f = 9;
        int product = e * f;
        System.out.println(product);
        
        int g = 25;
        int h = 5;
        int divide = g / h;
        System.out.println(difference);
        
        
        //Unary operator
        int p  = 1;
        System.out.println(p);
        int r = p++;
        int m = ++p;
        System.out.println(r);
        System.out.println(m);
        
        //Assignment Operator
        int num1 = 28;
        int num2 = 82;
        int add = num1 + num2;
                
        //Relational Operator
        int no1 = 73;
        int no2 = 37;
        System.out.println(no1==no2);
        System.out.println(no1>no2);
        System.out.println(no1<no2);
        System.out.println(no1>=no2);
        System.out.println(no1<=no2);
        System.out.println(no1!=no2);
        
        
        //Logical Operator
        int age = 19;
         System.out.println("Age is:"+age);
         String isAge =( age >= 18)? "Eligible to Drink" : "YOU are NOT eligible to drink";
         System.out.println(isAge);
        
        //Ternary Operator
        int gr = 6;
        int sm = 3;
        if ( gr > sm ){
            System.out.println("The greater number is:" + gr);
        }
        else{
            System.out.println("The greater number is:" + sm);
        }
    
    }
}