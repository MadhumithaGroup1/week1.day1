package week1.day1.assignment;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		int fact=1, num;
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("The factorial of the given number is "+fact);

		sc.close();
	}

}
