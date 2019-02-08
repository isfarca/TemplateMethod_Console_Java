package headfirst.templatemethod.schulung;

public abstract class KoffeinhaltigesGetraenk {
  
	final void zubereitungsRezept() {
		kocheWasser();
		aufsch�tten();
		inTasseSch�tten();
		zutatenHinzuf�gen();
	}
 
	abstract void aufsch�tten();
  
	abstract void zutatenHinzuf�gen();
 
	void kocheWasser() {
		System.out.println("Koche Wasser");
	}
  
	void inTasseSch�tten() {
		System.out.println("Sch�tte in Tasse");
	}
}
