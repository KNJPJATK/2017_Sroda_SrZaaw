package abstrakcyjne;

public abstract class Zwierze {
	
	private String miejsceZamieszkania;
	private int waga;
	
	public Zwierze() {
	}
	
	public Zwierze(String miejsceZamieszkania, int waga) {
		this.miejsceZamieszkania = miejsceZamieszkania;
		this.waga = waga;
	}
	
	//metoda abstrakcyjna
	public abstract String podajUlubioneJedzenie();
	
	//metody konkretne
	public void podajPodstawoweInfo() {
		System.out.println("Mieszkam w " + miejsceZamieszkania + 
				" i waze " + waga + "kg.");
	}

	public String getMiejsceZamieszkania() {
		return miejsceZamieszkania;
	}

	public void setMiejsceZamieszkania(String miejsceZamieszkania) {
		this.miejsceZamieszkania = miejsceZamieszkania;
	}

	public int getWaga() {
		return waga;
	}

	public void setWaga(int waga) {
		this.waga = waga;
	}
	
	
	

}
