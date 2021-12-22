public class boston42{
	private int month;
	private int day;
	private int year;

	public boston42(int m, int d, int y){//o constructor
		month=m;
		day=d;
		year=y;

		System.out.printf("Constructor: %s\n", this);//8a parei ena string me to %s kai me to this ua deiksei se ena antikeimeno
	}

	public String toString(){//h toString epistrefei ena string otan kaleitai to antikeimeno
		return String.format("%d:%d:%d", month, day, year);
	}

	public static void main(String[] args){
		boston42 apple = new boston42(3,2,3000);
		// epistrefei string giati to deis 8a
		//deiksei sto toString
	}
}