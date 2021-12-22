public class boston60{
	
	private boston59[] theList = new boston59[5];
	private int i = 0;

	public void add(boston59 a){
		if(i<theList.length){
			theList[i]=a;
			System.out.println("Item added at index "+i);
			i++;
		}
	}

	public static void main(String[] args){

		boston60 sk = new boston60();
		boston59c c = new boston59c(); // dhmiourgoume duo antikeimena klaseon
		boston59b b = new boston59b(); // pou einai uppoklaseis ths klashs ths listas
		sk.add(c);					   // opote mporoume na ta pros8esoume sthn lista
		sk.add(b);
	}

}