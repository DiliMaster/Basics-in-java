import java.util.*;

public class oop7 {
	
	public static void main (String[] args) {
		
	/*	int x = 10;
		int y = 15;
		
		byte b 10; // -128 to 127
		
		
		boolean bool=true;
		boolean booll=false;
		
		boolean bool3 = 3>5;//f
		boolean bool4 = 3<5;//t
		
		boolean bool5 = 3==3; //t
		boolean bool6 = 3!-4; //t  */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number= ");
		int Num1 = input.nextInt();
		
		System.out.print("Enter Second number= ");
		int Num2 = input.nextInt();
		
		//boolean flag=Num1>Num2;
	//	if(flag)System.out.println("3");
	
	
	//Another way to did this
	
	
		System.out.println("1");
		System.out.println("2");
		if(Num1>Num2)System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
		
		
		System.out.println("1");
		System.out.println("2");
		if(Num1>Num2){
	    
	    System.out.println("3");
		System.out.println("4");		
	}
	
		System.out.println("5");
		
		
		
	}
}

