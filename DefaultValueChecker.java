
/**
 * Write a description of class DefaultValueChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValueChecker
{
    byte a; //insatance variable
    short b;
    int c;
    long d;
    double e;
    float f;
    boolean g;
    char h;

    public static void main(String[] args){
    // we cant directly call instance variable so we have to call class and assign it a variable here w1 is the variable.
    // but we can call static variable.
    DefaultValueChecker w1 = new DefaultValueChecker();
    System.out.println(w1.a);
    System.out.println(w1.b);
    System.out.println(w1.c);
    System.out.println(w1.d);
    System.out.println(w1.e);
    System.out.println(w1.f);
    System.out.println(w1.g);
    System.out.println(w1.h);
    //since local variable is already defined under a class calling it again under a same class is not allowed.    
    }
}