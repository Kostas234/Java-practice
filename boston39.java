// polloi constructors kai xrhsh this

public class boston39{

		private int hour;
		private int minute;
		private int second;

		public boston39(int h, int m, int s){
			setTime(h,m,s);
		}
		public boston39(int h, int m){
			this(h,m,0);
		}
		public boston39(int h){
			this(h,0,0);
		}
		public void setTime(int h, int m, int s){
			hour=h;
			minute=m;
			second=s;
		}

		public String getTime(){
			return String.format("%02d:%02d:%02d", hour, minute, second);
		}

	public static void main(String[] args){
		boston39 a = new boston39(23,4,2);
		System.out.println(a.getTime());
		boston39 b = new boston39(3,43);
		System.out.println(b.getTime());
		boston39 c = new boston39(2);
		System.out.println(c.getTime());
		
	}
}