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
