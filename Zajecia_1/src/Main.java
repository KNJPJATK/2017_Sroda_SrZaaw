
public class Main {
	public static void main(String[]args){
//		TekstA a = new TekstA();
//		TekstB b = new TekstB();
//		TekstA ab = new TekstB();
//		
//		a.napisz();
//		b.napisz();
//		ab.napisz();
//		
//		b.napisz("cos");
//		
//		//a.napisz("cos z A ");
////		ab.napisz("cos z AB");
		
		Pracownik p1 = new Pracownik();
		Pracownik p2 = new Pracownik("Marian", 
				"Nowak", 1800);
		Pracownik p3 = new Dyrektor();
		Pracownik p4 = new Sekretarka();
		
		Pracownik[] pracownicy = {p1, p2, p3, p4};
		
		for(Pracownik pracownik : pracownicy) {
			pracownik.przedstawSie();
		}
	}
}
class TekstA{
	void napisz(){
		System.out.println("Tekst 1 ");
	}
}
class TekstB extends TekstA{
	void napisz(){
		System.out.println("Tekst 2");
	}
	void napisz(String s){
		System.out.println("Tekst 3 przeciazony");
	}
}