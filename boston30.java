import java.util.Random;

// suxnothta emfanishs timhs zariou gia 1000 fores
public class boston30{
	public static void main(String[] args){
		Random rand = new Random();
		int[] freq = new int[7];

		for(int i=1; i<1000; i++){
			freq[1+rand.nextInt(6)]++;
		}
		System.out.println("Value\tFrequency");

		for(int j=1; j<freq.length; j++){
			System.out.println(j+"\t"+freq[j]);
		}
	}
}