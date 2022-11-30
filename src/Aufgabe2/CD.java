// Leandro Lüthi; Matrikelnummer: 22-105-035
// Pascal Zürcher; Matrikelnummer: 22-111-314

package Aufgabe2;

public class CD extends StoreItem{
    protected String interpreter;

    public CD(int id, String title, String interpreter, int year, int price) {
        super(id, title, year, price);
        this.interpreter = interpreter;
    }

    public String getDescription(){
        return id + "(CD) " + title + "-" + interpreter + ", " + year + ", " + price + " CHF ";
    }

}
