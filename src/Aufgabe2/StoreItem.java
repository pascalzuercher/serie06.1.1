// Leandro Lüthi; Matrikelnummer: 22-105-035
// Pascal Zürcher; Matrikelnummer: 22-111-314

package Aufgabe2;

public abstract class StoreItem implements IArticle{
    protected int id, year, price;
    protected String title;

    public StoreItem(int id, String title, int year, int price){
        this.id = id;
        this. title = title;
        this.year = year;
        this.price = price;
    }

    public int getId (){
        return id;
    }

    public int getPrice(){
        return price;
    }

}
