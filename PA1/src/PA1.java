import java.util.Scanner;

public class PA1 {

	public static void main(String[] args) {
		//Problem A
		Scanner input = new Scanner (System.in);
		int inches, feet, yards;
		int total;
		
		System.out.println("Enter number of yards:");
		yards = input.nextInt();
		System.out.println("Enter number of feet:");
		feet = input.nextInt();
		System.out.println("Enter number of inches:");
		inches = input.nextInt();
		

		total = (inches + 12*(feet) + 36*(yards));
		System.out.println("The total length is " + total + " inches!");
		
		
		
		//Problem B
		Scanner input2 = new Scanner (System.in);
		int length;
		int feet2, yards2, inches2;
		
		System.out.println("Enter number of inches: ");
		length = input.nextInt();
		yards2 = (length/36);
		feet2 = ((length - (yards2*36))/12);
		inches2 = ((length - (yards2*36))%12);
		System.out.println("Yards: " + yards2);
		System.out.println("Feet: " + feet2);
		System.out.println("Inches: " + inches2);
		
	}
	
	}
