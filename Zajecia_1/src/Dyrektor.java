
public class Dyrektor extends Pracownik {
	
	String dzial;
	
	public Dyrektor() {
		this.imie = "Adam";
		this.dzial = "administracja";
	}
	
	public void przedstawSie() {
		super.przedstawSie();
		System.out.println("I kieruje dzialem: " + dzial);
	}

}
