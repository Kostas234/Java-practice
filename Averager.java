class Averager{
	public static void main(String[] arguments){

		int sum=0;
		int i;

		if(arguments.length>0){

			for(i=0; i<arguments.length; i++){
				sum+=Integer.parseInt(arguments[i]);
			}
		}

		System.out.println("Sum:"+sum);

	}
}
