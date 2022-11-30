// Leandro Lüthi; Matrikelnummer: 22-105-035
// Pascal Zürcher; Matrikelnummer: 22-111-314

package Aufgabe3;

public class Furniture {
    public Material material;
    protected double pricePerHour;
    protected double workedHours;

    public Furniture(Material material, double pricePerHour, double workedHours){
        this.material = material;
        this.pricePerHour = pricePerHour;
        this.workedHours = workedHours;
    }

    public double calculateEffort(){
        return pricePerHour*workedHours;
    }
}
