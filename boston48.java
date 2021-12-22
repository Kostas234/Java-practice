public class boston48{
	private int sum;
	private final int NUMBER; // an den to arxikopoihso edo tote
							  // prepei ston constructor
	public boston48(int x){
		NUMBER = x;
	}

	public void add(){
		sum+=NUMBER;

	}
	public String toString(){
		return String.format("%d\n", sum);
	}
	public static void main(String[] args){
		boston48 obj = new boston48(3);

		for(int i=0; i<5; i++){
			obj.add();
		}
	System.out.printf("%s",obj);
	}
}