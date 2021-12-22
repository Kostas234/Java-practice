public class arrayEx14{
	
	public static void main(String[] args){

		String[] a = {"poutsa", "skata", "gamiesai", "arxidi"};
		String[] b = {"mouni", "pfosos", "arxidi", "skata"};

		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i]==b[j])
					System.out.println(""+a[i]);
			}
		}
	}
}