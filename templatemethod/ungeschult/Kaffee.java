package headfirst.templatemethod.ungeschult;

public class Kaffee {
 
	void zubereitungsRezept() {
		kocheWasser();
		kocheKaffee();
		inTasseSch�tten();
		zuckerUndMilchHinzuf�gen();
	}
 
	public void kocheWasser() {
		System.out.println("Koche Wasser");
	}
 
	public void kocheKaffee() {
		System.out.println("Lasse Kaffee durch Filter laufen");
	}
 
	public void inTasseSch�tten() {
		System.out.println("Sch�tte Kaffee in Tasse");
	}
 
	public void zuckerUndMilchHinzuf�gen() {
		System.out.println("F�ge Zucker und Milch hinzu");
	}
}
