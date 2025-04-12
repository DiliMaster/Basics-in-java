import java.util.Scanner;


public class as5 {
	
	public static void main (String[] args) {
		
		
		
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your mark in science");
	int mark1 = input.nextInt();
	
	System.out.println("Enter your mark in maths");
	int mark2 = input.nextInt();
	
	
	System.out.println("Enter your mark in English");
	int mark3 = input.nextInt();
	
	int total = mark1+mark2+mark3;
    double avg = total/3;
		
    char grade = 'f';
    
    
    if (100>=avg && avg>=75)
    {
		grade= 'A';
		
		}
		
		 else if (75>=avg && avg>=65)
    {
		grade= 'B';
		
		}
		
		else  if (65>=avg && avg>=55)
    {
		grade= 'C';
		
		}
		
		 else if (55>=avg && avg>=45)
    {
		grade= 'S';
		
		}
	
	    System.out.println("your grade is:" +grade);
	}
}


