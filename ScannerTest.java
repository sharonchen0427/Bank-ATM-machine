package bank;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		char c=scanner.next().charAt(0);
		System.out.println("value = "+c);
		
		
		
	}

}
