//package w3school;

public class arrayEx5{

	public static boolean contains(int[] arr, int num){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==num)
				return true;
		}
		return false;
	}

	public static void main(String[] args){

		int[] ar1 = {12, 32, 54, 36, 63, 43};
		System.out.println(contains(ar1, 98));

	}
}