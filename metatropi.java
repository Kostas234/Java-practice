public class metatropi{
	public static void main(String[] args){
		if(args.length>0){
			String i="null";
			i=args[0];
			long j=0;
			switch(i){
				case "ena":
					j=1;
					break;
				case "duo":
					j=2;
					break;
			}	
			System.out.println(""+j);
		}
	}
}
