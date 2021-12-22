import java.util.EnumSet;

class boston45{
	public static void main(String[] args){
		//enhanced for gia na pareis ena range k oxi olo to array
		for(boston44 bos: EnumSet.range(boston44.b, boston44.c)){
			System.out.printf("%s\t%s\t%s\n",bos, bos.get(),bos.getyear());
		}
	}
}