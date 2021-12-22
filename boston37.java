public class boston37{

	private int hour;
	private int minute;
	private int second;
	
	public static void main(String[] args){

		boston37 time = new boston37();
		System.out.println(time.display(20,35,12));

	}

	public String display(int h, int m, int s){

		hour = ((h>0 && h<24) ? h : 0);
		minute =  ((m>0 && m<60) ? m : 0);
		second = ((s>0 && s<60) ? s : 0);
		
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

}