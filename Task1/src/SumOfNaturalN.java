/*
the Program is about sum the natural numbers
written by PavanKumar Bhukya
Date:22nd March 2022 
*/
import java.util.Scanner;
public class SumOfNaturalN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want calculate ?");
		int n=sc.nextInt();
		int sum = sumOfNauturalNumbers(n);
		System.out.println("Total="+sum);
			
		
	}
	
	
	// creating a function to return the sum of first n natural numbers.
	public static int sumOfNauturalNumbers(int n) {
		int sum=0;
		
		// computing the sum of first n natural numbers
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		
		// returning the sum
		return sum;
	}
	

}
