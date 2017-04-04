
public class Sekretarka extends Pracownik {
	
	int nrPokoju;
	
	public void przedstawSie() {
		super.przedstawSie();
		System.out.println("I pracuje w pokoju nr " + nrPokoju);
	}

}
