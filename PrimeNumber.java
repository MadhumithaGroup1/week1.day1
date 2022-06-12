package week1.day1.assignment;
import java.util.*;
public class PrimeNumber {
	
	public static void main(String[] args) {
		
	int num, halfnum;
	boolean flag = false;
	System.out.println("Enter a number");
	Scanner sc= new Scanner(System.in);
	num = sc.nextInt();
	halfnum = num/2;
	for(int i=2;i<=halfnum;i++) {
		if(num%i == 0) 
			flag = false;
		else
			flag = true;
	}
	if(flag == true)
		System.out.println("Prime Number");
	else
		System.out.println("Not a Prime Number");
	
	sc.close();
	}
}


