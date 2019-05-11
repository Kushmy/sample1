package guvi;

import java.util.Scanner;

public class alpha {
	public static void main(String[] args)
	{
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		ch=s.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			System.out.println("Alphabet");
		else
			System.out.println("No");
	}

}
