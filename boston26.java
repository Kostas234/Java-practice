import java.util.Random;

class boston26{
	public static void main(String[] args){
		Random dice= new Random();
		int num;

		for(int c=1; c<=10; c++){
			num=1+dice.nextInt(6);// moiazei me to Scanner
			System.out.println(num);

		}

	}
}