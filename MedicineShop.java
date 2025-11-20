import java.util.Scanner;

/**
 * Write a description of class MedicineShop here.
 *
 * @author Pradhara Dhaubhadel
 * @version v1
 */
public class MedicineShop
{
    public static void main(String[] args){
           
           Scanner medicine = new Scanner(System.in);
           
           //medicine 1
           System.out.println("Enter the name of medicine 1");
           String MedicineName = medicine.nextLine();
           System.out.println("Enter the price per tbl of medicine 1");
           double Price = medicine.nextDouble();
           medicine.nextLine();
           System.out.println("Enter the stock of medicine 1");
           int inStock = medicine.nextInt();
           medicine.nextLine();
           
           
           //medicine 2
           System.out.println("Enter the name of medicine 2");
           String MedicineName1 = medicine.nextLine();
           System.out.println("Enter the price per tbl of medicine 2");
           double Price1 = medicine.nextDouble();
           medicine.nextLine();
           System.out.println("Enter the stock of medicine 2");
           int inStock1 = medicine.nextInt();
           medicine.nextLine();
           
           //medicine 3
           System.out.println("Enter the name of medicine 3");
           String MedicineName2 = medicine.nextLine();
           System.out.println("Enter the price per tbl of medicine 3");
           double Price2 = medicine.nextDouble();
           medicine.nextLine();
           System.out.println("Enter the stock of medicine 3");
           int inStock2 = medicine.nextInt();
           medicine.nextLine();
           
           //medicine 4
           System.out.println("Enter the name of medicine 4");
           String MedicineName3 = medicine.nextLine();
           System.out.println("Enter the price per tbl of medicine 4");
           double Price3 = medicine.nextDouble();
           medicine.nextLine();
           System.out.println("Enter the stock of medicine 4");
           int inStock3 = medicine.nextInt();
           medicine.nextLine();
           
           //medicine 5
           System.out.println("Enter the name of medicine 5");
           String MedicineName4 = medicine.nextLine();
           System.out.println("Enter the price per tbl of medicine 5");
           double Price4 = medicine.nextDouble();
           medicine.nextLine();
           System.out.println("Enter the stock of medicine 5");
           int inStock4 = medicine.nextInt();
           medicine.nextLine();
           
           System.out.println("===========Medicine Shop Inventory============");
           
           System.out.println("Medicine Name\tPrice(per tbl)\tTotal stock");
           System.out.println(MedicineName+"\t\tNRs " +Price+ "\t\t" +inStock);
           System.out.println(MedicineName1+"\t\tNRs " +Price1+ "\t\t" +inStock1);
           System.out.println(MedicineName2+"\t\tNRs " +Price2+ "\t\t" +inStock2);
           System.out.println(MedicineName3+"\t\tNRs " +Price3+ "\t\t" +inStock3);
           System.out.println(MedicineName4+"\t\tNRs " +Price4+ "\t\t" +inStock4);
           
           
           System.out.println("==============================================");
           
    }
}