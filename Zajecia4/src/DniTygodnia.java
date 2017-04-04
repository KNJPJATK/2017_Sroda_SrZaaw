
public enum DniTygodnia {
	
	PONIEDZIALEK(1), WTOREK(2), SRODA(3), CZWARTEK(4), PIATEK(5),
	SOBOTA(6), NIEDZIELA(7);
	
	DniTygodnia(int numer) {
		this.numer = numer;
	}
	
	private int numer;

	public int getNumer() {
		return numer;
	}
	
}
