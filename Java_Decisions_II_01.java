
package java_decisions_ii_01;
import java.util.Scanner;

public class Java_Decisions_II_01 {


    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);   
     double salary;
     int years;
     String name;
     double result;
     
     System.out.print("What is your name? ");
     name = input.next();
     
     System.out.print("What is your salary? $");
     salary = input.nextDouble();
     
     System.out.print("How long in years have you been working for Conchware? ");
     years = input.nextInt();
     
     if  (years <=3)
     {
         result = salary * 0.03;
         
         System.out.print(name+", your bonus this year will be $"+result);
     }
     
     else if (years >= 21)
     {
         result = salary * 0.12;
         
         System.out.print(name+", your bonus this year will be $"+result);
     }
     
     else if (years >= 13)
     {
         result = salary * 0.1;
         
         System.out.print(name+", your bonus this year will be $"+result);
     }
     
     else if (years >= 9)
     {
         result = salary * 0.08;
         
         System.out.print(name+", your bonus this year will be $"+result);
     }
     
     else if (years >= 4)
     {
         result = salary * 0.06;
         
         System.out.print(name+", your bonus this year will be $"+result);
     }
     
    }
    
}
