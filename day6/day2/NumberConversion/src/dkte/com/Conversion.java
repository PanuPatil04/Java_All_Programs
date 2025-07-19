package dkte.com;
import java.util.Scanner;
import java.lang.*;

public class Conversion {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to convert:");
		int no=sc.nextInt();
		
		System.out.println("Given Number" +no);
		
		System.out.println("Binary Equvivalent:" +Integer.toBinaryString(no));
		System.out.println("Octal Equvivalent:" +Integer.toOctalString(no));
		System.out.println("Hex Equvivalent:" +Integer.toHexString(no));
	}

}
