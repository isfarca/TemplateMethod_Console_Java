package headfirst.templatemethod.schulung;

public class Kaffee extends KoffeinhaltigesGetraenk {
	public void aufsch�tten() {
		System.out.println("Lasse Kaffe durch Filter laufen");
	}
	public void zutatenHinzuf�gen() {
		System.out.println("F�ge Zucker und Milch hinzu");
	}
}
