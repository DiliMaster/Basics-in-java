
import java.util.Scanner;


public class as4 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Input your  Mark 1 :");
		int mark1 = input.nextInt();
		
		System.out.println("Input your Mark 2 :");
		int mark2 = input.nextInt();
		
		System.out.println("Input your Marks 3 :");
		int mark3 = input.nextInt();
		
		int total = mark1+mark2+mark3;
		double avg = total/3;
		
		char grade = 'f';
		
		
		
	/*	
		if (avg>=75){
			
			System.out.println("your grade is A");
			
			}
		if (avg>=65){
			
			System.out.println("your grade is B");
			
			}
			
			if (avg>=55){
			
			System.out.println("your grade is C");
			
			}
		
		if (avg<=45){
			
			System.out.println("your grade is S");
			
			}
			
		if(avg<35){
				
				System.out.println("your grade is F");
				}
		
		*/
		if (avg>=45){
			
			grade ='S';
			
			}
			
			if (avg>=55){
			
			grade ='C';
			
			}
			if (avg>=65){
			
			grade ='B';
			
			}
			
			
		
		if (avg>=75){
			
			grade ='A';
			
			}
			
			//
			
		
			
			
			System.out.println("Grade:"+ grade);
			
		
			
		
		
		
		
	}
}

