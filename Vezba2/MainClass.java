package Vezba2;

public class MainClass {
public static void main(String[] args) {
		
		Fakultet f1 = new Fakultet();
		f1.nazivNaFakultet = "FIKT";
		f1.brojNaSmerovi = 4;
		f1.brojNaStudenti = 1000;
		f1.dekan = "Aleksandar Markoski";
		f1.sediste = "Bitola";
		
		f1.pMetod();
		System.out.println("Namalen broj studenti: " + f1.vMetod(50));
		f1.tMetod();
		
		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "TFB";
		f2.brojNaSmerovi = 4;
		f2.brojNaStudenti = 300;
		f2.dekan = "Mitko Kostov";
		f2.sediste = "Bitola";
		
		f2.pMetod();
		System.out.println("Namalen broj studenti: " + f2.vMetod(30));
		f2.tMetod();
	}
}