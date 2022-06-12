package week1.day1.assignment;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {

		int num1=0, num2=1, num3, range;
		System.out.println("Fibonacci Series");
		System.out.println("Enter a range");
		Scanner sc= new Scanner(System.in);
		range = sc.nextInt();
		if (range==1) {
			System.out.println(num1);
		}
		else {
			System.out.println(num1);
			for(int i=2;i<=range;i++) {
				num3=num1+num2;
				System.out.println(num3);
				num1=num2;
				num2=num3;
			}
		}
		sc.close();

	}

}
