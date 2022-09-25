package fr.dauphine.javaavance.td2;

public class Exo1 {
	
	class Mere {
		
		protected int meth() {
			return 42;
		}
		
		public void printMeth() {
			System.out.println(meth());
		}
	}
	
	class Fille extends Mere {
		
		public int meth() {
			return 24;
		}
	}
	
	class Main {
		
		public static void main(String[] args) {
			Mere mere = new Mere();
			System.out.println(mere.meth());
			mere.printMeth();
			Fille fille = new Fille();
			System.out.println(fille.meth());
			fille.printMeth();
			Mere mereFille = new Fille();
			System.out.println(mereFille.meth());
			mereFille.printMeth();
		}
		
	}	      
}

// 1 - Le main affiche : 42 42 24 42 42 42
// 2 - 2, en appelant .meth(), et 3 depuis main
// 3 - Elles deviennent propres aux classes
// 4 - Elles deviennent accessibles à tous