package headfirst.templatemethod.schulung;

public abstract class KoffeinhaltigesGetraenkMitHook {
 
	void zubereitungsRezept() {
		kocheWasser();
		aufsch�tten();
		inTasseSch�tten();
		if (kundeWillZutaten()) {
			zutatenHinzuf�gen();
		}
	}
 
	abstract void aufsch�tten();
 
	abstract void zutatenHinzuf�gen();
 
	void kocheWasser() {
		System.out.println("Koche Wasser");
	}
 
	void inTasseSch�tten() {
		System.out.println("Sch�tte in Tasse");
	}
 
	boolean kundeWillZutaten() {
		return true;
	}
}
