package Week1Problems;

class Book {
	private int pages = 1500;
	public void setPages(int numPages) {
		pages = numPages;
	}
	public int getPages() {
		return pages;
	}
}

class Dictionary extends Book {
	private int definitions = 52500;
	public void setDefinitions(int numDef) {
		definitions = numDef;
	}
	public int getDefinitions() {
		return definitions;
	}
	public double computeRatio() {
		// return definitions/pages; WRONG
		// return getDefinitions()/pages; WRONG
		// return definitions/getPages(); CORRECT
		return getDefinitions() / getPages(); // CORRECT
	}
}

public class C1BookDict {
	public static void main(String[] args) {
		Dictionary webster = new Dictionary(); // sub class can use the attributes or methods of super class but super class can not
		System.out.println("Nb of pages:" + webster.getPages());
		System.out.println("Nb of defs:" + webster.getDefinitions());
		System.out.println("Defs per page:" + webster.computeRatio());
	}
}
