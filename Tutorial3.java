
/**
 * Write a description of class Tutorial3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial3
{
    int age; // local variable
    static int qty; //static variable
    public static void main(String[] args){
        //int i; local variable ( local variable must be defined
        //System.out.println(i);
        // error 
        
        int i = 10; //local variable
        System.out.println(i);
        
        //Implicit Typecasting
        double db = i;
        System.out.println(db);
        
        int b = 7;
        double db1 = b;
        System.out.println(db1);
        
        
        //Explicit Typecasting ( Compiler wont convert it on its own)
        double dtb = 10.09;
        int itr = (int)dtb;
        
        //Exceptions in arithmetics
        
        byte bt = 10;
        byte btr = 11;
        byte sum = (byte)(bt+btr);
        
        short s = 7000;
        short st = 300;
        short add = (short)(s+st);
        
        // Max, Min, Size and bytes
        
        System.out.println(Byte.MAX_VALUE); // returns maximum value
        System.out.println(Byte.MIN_VALUE); //returns minimum value
        System.out.println(Byte.SIZE); // return in bits
        System.out.println(Byte.BYTES); //return in bytes
        
        System.out.println(Short.MAX_VALUE); // returns maximum value
        System.out.println(Short.MIN_VALUE); //returns minimum value
        System.out.println(Short.SIZE); // return in bits
        System.out.println(Short.BYTES); //return in bytes
        
        System.out.println(Integer.MAX_VALUE); // returns maximum value
        System.out.println(Integer.MIN_VALUE); //returns minimum value
        System.out.println(Integer.SIZE); // return in bits
        System.out.println(Integer.BYTES); //return in bytes
        
        //Escape Sequence
        
        System.out.println("Hello\nWorld");// new line
        System.out.println("Hamro\tNepal");// tab
        System.out.println("She said \" Hi \" ");// Double quotation
        
        //Umicode escape sequence
        System.out.println("\u2764");
        
    }
}