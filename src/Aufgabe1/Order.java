package Aufgabe1;

public class Order {
    private int id;
    private String customerName;
    private String customerAddress;
    private Book[] books;

    private static int idnr = 1;

    public Order(){
        this.id = idnr;
        this.customerName ="";
        this.customerAddress="";
        this.books = new Book[0];

        idnr++;
    }

    public Order(String customerName, String customerAddress, Book ... books ){
        this.id = idnr;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.books = books;

        idnr++;
    }

    public String toString() {
        String retstr = "Order id: "+this.id+"\nCustomer: "+this.customerName+"\n"+this.customerAddress;
        for(Book book : books){
            retstr += "\n"+book.toString();
        }
        return retstr;
    }

    public void addBook(Book book){
        Book[] arr = new Book[this.books.length+1];
        for(int i = 0; i < this.books.length; i++){
            arr[i]=this.books[i];
        }
        arr[this.books.length]=book;
        this.books=arr;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }
}
