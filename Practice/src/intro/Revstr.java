package intro;

import java.util.Scanner;

public class Revstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1="PRADYUTHI";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to reverse   ");
		String s1=sc.next();
		int n= s1.length();
		String s2="";
		for(int i=n-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2.toLowerCase());	

	}

}
