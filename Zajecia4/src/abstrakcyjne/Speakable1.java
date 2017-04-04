package abstrakcyjne;

public interface Speakable1 extends Speakable {
	
	void dajGlos();
	
	default void krzycz() {
		System.out.println("AAAAAAA");
	}

}
