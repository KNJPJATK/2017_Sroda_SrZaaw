package abstrakcyjne;

public class Main {

	public static void main(String[] args) {
		
		Zwierze[] zwierzeta = {new Pies(), 
								new Kot(), new Wilk()};
		
		for (Zwierze zw : zwierzeta) {
			System.out.println("Moje ulubione jedzenie to: " +
						zw.podajUlubioneJedzenie());
		}
		
		ZwierzeDomowe[] zwierzetaDomowe = {new Pies(), new Kot()};
		
		for (ZwierzeDomowe zwDom : zwierzetaDomowe) {
			zwDom.bawSie();
		}
		
	}

}
