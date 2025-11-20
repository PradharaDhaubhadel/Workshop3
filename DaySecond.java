
/**
 * Write a description of class DaySecond here.
 *
 * @author Pradhara Dhaubhadel
 * @version v1
 */
public class DaySecond
{
    public static void main(String[] args){
    String name = "Pradhara";
    int age = 18;
    System.out.println("My name is "+name+" and my age is "+age+"");
    
    int a = 4;
    int b = 2;
    int c = a+b;
    System.out.println(c);
    System.out.println(a==b);
    System.out.println(a!=b);
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a>=b);
    System.out.println(a<=b);
    
    int h = 1;
    System.out.println(h);
    System.out.println(++h); //h=2 and ++h=2
    System.out.println(h); //h=2
    System.out.println(h++); // h=3 and h++=2
    //h++ doesnt change,value remains same as of previous value of h
    System.out.println(h); // h=3
    
    }
}