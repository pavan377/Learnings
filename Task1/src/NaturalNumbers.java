/*
The Program is about print the Natural number up to given size
Written by PavanKumar Bhukya
Date:22nd March 2022
*/
import java.util.Scanner;
public class NaturalNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size:");
			int a=sc.nextInt();
			//Loop is print the output in desired manner
			System.out.println("Natural Numbers are\n");
			for(int i=1;i<=a;i++) {
				System.out.println(i);
			}
	}

}
