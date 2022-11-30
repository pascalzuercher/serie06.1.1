// Leandro Lüthi; Matrikelnummer: 22-105-035
// Pascal Zürcher; Matrikelnummer: 22-111-314

package Aufgabe3;

public class Table extends Furniture{
    private double area;
    public Table(Material material, double pricePerHour, double workedHours, double area){
        super(material, pricePerHour, workedHours);
        this.area = area;
    }
    
    public double totalPrice(){return calculateEffort()+(this.area*this.material.getMaterialCost());}
}
