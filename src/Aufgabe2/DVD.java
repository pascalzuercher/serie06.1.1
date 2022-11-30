// Leandro Lüthi; Matrikelnummer: 22-105-035
// Pascal Zürcher; Matrikelnummer: 22-111-314

package Aufgabe2;

public class DVD extends StoreItem {
    public DVD(int id, String title, int year, int price) {
        super(id, title, year, price);
    }

    public String getDescription(){
        return id + "(DVD) " + title + ", " + year + ", " + price + "CHF";
    }
}
