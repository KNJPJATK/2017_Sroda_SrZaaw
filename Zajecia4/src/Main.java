import java.util.Arrays;

public class Main {
	public static void main (String [] args){
		
		DniTygodnia dzien1 = DniTygodnia.PONIEDZIALEK;
		DniTygodnia dzien2 = DniTygodnia.WTOREK;
		
		int nr = dzien1.getNumer();
		
		switch(dzien1) {
		case PONIEDZIALEK: 
		case WTOREK:
			System.out.println("Nie lubie poniedzialkow");
		}
		
		DniTygodnia dzien323 = DniTygodnia.valueOf("SRODA");
		
		System.out.println(Arrays.toString(DniTygodnia.values()));
		
		System.out.println(DniTygodnia.valueOf("SRODA"));
		
		System.out.println(DniTygodnia.values());
	}
	
}
