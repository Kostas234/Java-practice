public class boston56{ // Polymorphic Arguements
	
	public void kill(boston55a x){ // mporoume na dosoum os orisma
		x.skase(); 				   // antikeimena boston55b, boston55c
								   // epeidh einai upoklaseis tou boston55a
	}

	public static void main(String[] args){
		boston56 killem = new boston56();
		boston55a b55 = new boston55a();
		boston55a b55b = new boston55b();
		boston55a b55c = new boston55c();

		killem.kill(b55);
		killem.kill(b55b);
		killem.kill(b55c);

	}
}