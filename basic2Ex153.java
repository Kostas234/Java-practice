//package w3school;

import java.util.Scanner; 

public class basic2Ex153{
	
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		double a = in.nextDouble();
		System.out.println("First number: "+a);
		double b = in.nextDouble();
		System.out.println("Second number: "+b);
		if(a>0 && a<1 && b>0 && b<1)
			System.out.println("True");
		else
			System.out.println("False");
	}
}