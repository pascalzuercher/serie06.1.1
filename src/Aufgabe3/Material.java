// Leandro Lüthi; Matrikelnummer: 22-105-035
// Pascal Zürcher; Matrikelnummer: 22-111-314

package Aufgabe3;

public enum Material {
    Eiche(10),
    Buche(13),
    Esche(5);

    private double materialCost;
    Material(double c){this.materialCost=c;}
    public double getMaterialCost(){return this.materialCost;}
}
