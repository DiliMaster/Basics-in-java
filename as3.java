import java.util.Scanner;

public class as3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your marks science: ");
        int science = input.nextInt();
        
         System.out.print("Enter your marks maths: ");
        int maths = input.nextInt();
        
         System.out.print("Enter your marks English: ");
        int english = input.nextInt();
        
        int total= (english+maths+science);
        
       double averege = (double)( total/3);
       
        System.out.println();
       
       
       System.out.println("Your total marks:"+total);
       
       System.out.println("your Average :" +averege);
        
        
        if ( averege< 50) {
            System.out.println("status:fail");
            
        } else {
            System.out.println("status:pass");
            
        }

         
    }
}

