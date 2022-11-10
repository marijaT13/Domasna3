package Vezba3;

public class PC {
	public int memorija;
	public String tipNaMemorija;
	public int HD;
	public String golemina="GB";
	
	public PC () {
		this.memorija = 2;
		this.tipNaMemorija = "DDR2";
		this.HD= 160;
	}
	
	public void prvMetod(int zgolemiMemorija, int novHD){
		System.out.println("Memorijata beshe " + this.memorija + golemina + ", sega iznesuva " + (zgolemiMemorija + memorija) + golemina + ".");
		System.out.println("Tipot na memorijata e " + this.tipNaMemorija + ".");
		System.out.println("HD ima golemina od " + novHD + golemina + ". Prethodno iznesuvashe " + this.HD + golemina + ".");
	}
}
