package abstrakcyjne;

public class Kot extends Zwierze implements 
	ZwierzeDomowe, Speakable, Speakable1{
	
	private String umaszczenie;
	
	public Kot() {
		super();
		this.umaszczenie = "mieszane";
	}
	
	@Override
	public String podajUlubioneJedzenie() {
		return "whiskas";
	}

	@Override
	public void bawSie() {
		System.out.println("Ganiam za kropka");
	}

	@Override
	public void dajGlos() {
		System.out.println("MIAAAU");
	}

}
