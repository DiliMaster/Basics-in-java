import java.util.Scanner;

public class as2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Salary: ");
        int salary = input.nextInt();
        
        if (salary <= 20000) {
            System.out.println("You are eligible for a bonus.");
            System.out.println("Your new salary is: " + (salary + 5000));
        } else {
            System.out.println("You are not eligible for a bonus.");
            System.out.println("Your salary is: " + salary);
        }

         
    }
}

