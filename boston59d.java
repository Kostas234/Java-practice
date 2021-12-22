public class boston59d{
	private boston59c[] theList = new boston59c[5];
	private int i=0;

	public void add(boston59c d){
		if(i<theList.length){
			theList[i]=d;
			System.out.println("Item added at index "+i);
			i++;
		}
	}
	public static void main(String[] args){
		boston59d list = new boston59d();
		boston59c c = new boston59c();
		boston59c d = new boston59c();
		list.add(c);
		list.add(d);
	
	}
	
}