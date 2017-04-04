package abstrakcyjne;

public class Pies extends Psowate implements ZwierzeDomowe{
	
	private String rasa;
	
	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public Pies() {
		super();
		this.rasa = "mieszaniec";
	}

	@Override
	public String podajUlubioneJedzenie() {
		return "kosc";
	}

	@Override
	public void bawSie() {
		System.out.println("Aportuje!");
	}

}
