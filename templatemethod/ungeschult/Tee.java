package headfirst.templatemethod.ungeschult;

	public class Tee {
	 
		void zubereitungsRezept() {
			kocheWasser();
			teebeutelZiehenLassen();
			inTasseSch�tten();
			zitroneHinzuf�gen();
		}
	 
		public void kocheWasser() {
			System.out.println("Koche Wasser");
		}
	 
		public void teebeutelZiehenLassen() {
			System.out.println("Lasse Tee ziehen");
		}
	 
		public void zitroneHinzuf�gen() {
			System.out.println("F�ge Zitrone hinzu");
		}
	 
		public void inTasseSch�tten() {
			System.out.println("Sch�tte in Tasse");
		}
}
