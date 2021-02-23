package java_desicions_ii_03;
import java.util.Scanner;


public class Java_Desicions_II_03 {


    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
     
     double Dr1 = 2.53;
     double Pa2 = 5.07;
     double Pe3 = 4.78;
     double Je4 = 3.67;
     double Te5 = 6.18;
     int qua;
     double dis;
     double total;
     String name;
     double price;
     
     System.out.print("Enter item: ");
     name = input.nextLine();
     
     System.out.print("Enter "+name+" quantity: ");
     qua = input.nextInt();
     
     if (name.equalsIgnoreCase("Drink"))
     {
         if (qua >= 30)
         {
             price = Dr1*qua;
             dis = price*0.8;
             total = price+dis;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $"+dis);
             System.out.println("Total Price: $"+total);
             
         }
         else if (qua>=15)
         {
             price = Dr1*qua;
             dis = price*0.5;
             total = price+dis;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $"+dis);
             System.out.println("Total Price: $"+total);
         }
      else 
         {
             price = Dr1*qua;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $0");
             System.out.println("Total Price: $"+price);
         }
      
     }
     
     else if (name.equalsIgnoreCase("Paper Towels"))
     {
         if (qua >= 20)
         {
             price = Pa2*qua;
             dis = price*0.8;
             total = price+dis;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $"+dis);
             System.out.println("Total Price: $"+total);
             
         }
         else if (qua >= 17)
         {
             price = Pa2*qua;
             dis = price*0.6;
             total = price+dis;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $"+dis);
             System.out.println("Total Price: $"+total);
         }
         else 
         {
             price = Pa2*qua;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $0");
             System.out.println("Total Price: $"+price);
         }
     }
     
     else if (name.equalsIgnoreCase("Peanut Butter"))
     {
         if (qua >= 25)
         {
             price = Pe3*qua;
             dis = price*0.6;
             total = price+dis;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $"+dis);
             System.out.println("Total Price: $"+total);
             
         }
         else if (qua>=20)
         {
             price = Pe3*qua;
             dis = price*0.3;
             total = price+dis;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $"+dis);
             System.out.println("Total Price: $"+total);
         }
         else 
         {
             price = Pe3*qua;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $0");
             System.out.println("Total Price: $"+price);
         }
     }
     
     else if (name.equalsIgnoreCase("Jelly"))
     {
         if (qua >= 15)
         {
             price = Je4*qua;
             dis = price*0.1;
             total = price+dis;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $"+dis);
             System.out.println("Total Price: $"+total);
             
         }
         else if (qua>=10)
         {
             price = Je4*qua;
             dis = price*0.7;
             total = price+dis;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $"+dis);
             System.out.println("Total Price: $"+total);
         }
         else 
         {
             price = Je4*qua;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $0");
             System.out.println("Total Price: $"+price);
         }
     }
    
     else if (name.equalsIgnoreCase("Tea"))
     {
         if (qua >= 60)
         {
             price = Te5*qua;
             dis = price*0.15;
             total = price+dis;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $"+dis);
             System.out.println("Total Price: $"+total);
             
         }
         else if (qua>=30)
         {
             price = Te5*qua;
             dis = price*0.1;
             total = price+dis;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $"+dis);
             System.out.println("Total Price: $"+total);
         }
         else 
         {
             price = Te5*qua;
             
             System.out.println("Name: "+name);
             System.out.println("Quantity: "+qua);
             System.out.println("Discount: $0");
             System.out.println("Total Price: $"+price);
         }
     }
     
    }
    
}
