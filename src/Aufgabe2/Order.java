// Leandro Lüthi; Matrikelnummer: 22-105-035
// Pascal Zürcher; Matrikelnummer: 22-111-314

package Aufgabe2;

import Aufgabe1.Book;

import java.util.List;

public class Order {
    private int id;
    private String customerName;
    private String customerAddress;
    private IArticle[] iArticle;
    private static int idnr = 1;

    public Order(){
        this.id = idnr;
        this.customerName ="";
        this.customerAddress="";
        this.iArticle = new IArticle[0];
        idnr++;
    }

    public Order(String customerName, String customerAddress, IArticle ... iArticles ){
        this.id = idnr;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.iArticle = iArticles;

        idnr++;
    }

    public String toString() {
        String retstr = "Order id: "+this.id+"\nCustomer: "+this.customerName+"\n"+this.customerAddress;
        for(IArticle iArticles: iArticle){
            retstr += "\n"+iArticles.toString();
        }
        return retstr;
    }

    public void add(IArticle a){
        IArticle[] arr = new IArticle[this.iArticle.length+1];
        for(int i = 0; i < this.iArticle.length; i++){
            arr[i]=this.iArticle[i];
        }
        arr[this.iArticle.length]=a;
        this.iArticle=arr;
    }

    public int getId(){
        return this.id;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getCustomerAddress(){
        return this.customerAddress;
    }

    public Iterable<IArticle> getOrderedArticles(){
        return List.of(this.iArticle);
    }

    public int getTotalPrice(){
        int sum = 0;
        for (IArticle iarticle : getOrderedArticles()){
            sum += iarticle.getPrice();
        }
        return sum;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }

}
