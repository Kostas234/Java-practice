public class boston55c extends boston55a{//polymorphism

	void skase(){
		System.out.println("ths manas sou");
	}

	public static void main(String[]args){
		//polymorphic array
		boston55a[] moulos = new boston55a[2];
		moulos[0] = new boston55b(); //giati to boston55b einai
									 //upoklash tou boston 55a
		moulos[1] = new boston55c(); //gia ton idio logo
		for(int i=0; i<2; i++){
			moulos[i].skase();
		}	
	}
}