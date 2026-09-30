package NSBM.JAVA;

class book{
    String title;
    String author;
    double price;


    void book(){
        title = "Unknown";
        author =  "Unknown";
        price = 0.0;
    }

    void book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println("Book Name : " +title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+"$" +price );
    }

}

class Booktest{

    public static void main(String[] arg){
        
        book b1 = new book();
        b1.display();

        book b2 = new book("Madoldoowa", "Mr.Martin", 157.33);
        b2.display();
        
    }
}