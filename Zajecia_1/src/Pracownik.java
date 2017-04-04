
public class Pracownik {
	
	String imie;
	String nazwisko;
	int pensja;
	
	public Pracownik() {
		this.imie = "Jan";
		this.nazwisko = "Kowalski";
		this.pensja = 1000;
	}
	
	public Pracownik(String imie, String nazwisko, 
			int pensja) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pensja = pensja;
	}
	
	public void przedstawSie() {
		System.out.println("Nazywam sie " + imie 
				+ " " + nazwisko + " i zarabiam " + pensja);
	}

}
