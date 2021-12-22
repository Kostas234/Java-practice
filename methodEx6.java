import java.util.Scanner;

public class methodEx6{
	
	public static void main(String[] args){

		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Dose enan akeraio: ");
		int a = in.nextInt();

		while(a>0){
			sum+=a%10;
			a=a/10;
		}
		System.out.println(sum);
	}
}