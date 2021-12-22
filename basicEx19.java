import java.util.Scanner;

public class basicEx19{

	void convert(int num){

		int[] c = new int[10];
		int i=0;

		while(num!=0){

			c[i]=num%2;
			num=num/2;
			i++;
			
		}
		i=i-1;
		String l = new String();
		while(i>=0){
			l=l+c[i];
			i--;
		}
		System.out.println(""+l);
	}

	public static void main(String[] args){

		basicEx19 o = new basicEx19();
		Scanner in = new Scanner(System.in);

		System.out.println("Dose enan akeraio: ");
		int a = in.nextInt();
		o.convert(a);

	}
}