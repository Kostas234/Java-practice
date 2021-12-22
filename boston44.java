/*To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
Example
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

You can access enum constants with the dot syntax:
Level myVar = Level.MEDIUM; 
*/

//parakato enum se styl klashs

public enum boston44{
	a("alert","2"),//constants and objects
	b("alarm","4"),// otan ftiaxneis auta dhmiourgeitai apo 
	c("salam","6");//thn java mia array values(), pou einai static methodos

	private final String desc;
	private final String year;	

	boston44(String description, String birthday)//enumeration constructor
	{
		desc=description;
		year=birthday;
	}
	public String get(){
		return desc;
	}

	public String getyear(){
		return year;
	}
	public static void main(String[] args){
		for(boston44 bos:boston44.values()){
			System.out.printf("%s\t%s\t%s\n",bos, bos.get(),bos.getyear());
		}
	}
}