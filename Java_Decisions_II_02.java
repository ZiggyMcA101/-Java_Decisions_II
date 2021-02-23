package java_decisions_ii_02;
import java.util.Scanner;

public class Java_Decisions_II_02 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
     
     String name;
     int gr1;
     int gr2;
     int gr3;
     int add;
     int avg;
     
     
     System.out.print("What is your name? ");
     name = input.next();
     System.out.print("Enter first grade: ");
     gr1 = input.nextInt();
     System.out.print("Enter second grade: ");
     gr2 = input.nextInt();
     System.out.print("Enter third grade: ");
     gr3 = input.nextInt();
     
     add = gr1+gr2+gr3;
     avg = add/3;
     
     if (avg >= 90)
     {
         System.out.println("The average grade for "+name+" is "+avg+". "+name+" is currently averaging an A");
     }
     
     else if (avg >= 80)
     {
         System.out.println("The average grade for "+name+" is "+avg+". "+name+" is currently averaging a B");
     }
     
     else if (avg >= 70)
     {
         System.out.println("The average grade for "+name+" is "+avg+". "+name+" is currently averaging a C");
     }
     
     else if (avg >= 60)
     {
         System.out.println("The average grade for "+name+" is "+avg+". "+name+" is currently averaging a D");
     }
     
     else if (avg >= 0)
     {
         System.out.println("The average grade for "+name+" is "+avg+". "+name+" is currently averaging a F");
     }
             
     
     
       
    }
    
}
