//package w3school;

import java.util.Scanner;

public class basicEx7
{
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);

		System.out.println("Dose enan arithmo: ");
		int a = in.nextInt();

		for(int i=1; i<11; i++){
			int b=i*a;
			System.out.println(+i+"*"+a+" = "+b);
		}
	}
}