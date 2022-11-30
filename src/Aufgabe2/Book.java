// Leandro Lüthi; Matrikelnummer: 22-105-035
// Pascal Zürcher; Matrikelnummer: 22-111-314

package Aufgabe2;
//***************************************************
//Datei fuer Serie 6, Teilaufgabe 2
//***************************************************



public class Book  extends StoreItem {
	protected String author;

	/**
	 * constructor
	 */
	public Book(int id, String title, String author, int year, int price) {
		super(id, title, year, price);
		this.author = author;
	}

	@Override
	public String getDescription() {
		return id + " (Book) " + title + ", by " + author +
				", " + year + ", " + price + " CHF";
	}
}
