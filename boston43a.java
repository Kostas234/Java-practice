public class boston43a{ //composition

	private String name;
	private boston42 birthday;

	public boston43a(String theName, boston42 theDate){
		name=theName;
		birthday=theDate;
	}
	public String toString(){
		return String.format("Name: %s, Birthday: %s", name, birthday);
	}
}