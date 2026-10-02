//question 1 - book

//a bookshop wants to store details about the books it sells.

//A) create a class Book with three private fields: title, author and price.

//B) write ta getter and setter for each field.

//c) modify setPrice() so that it rejects any price that is zero or negative and prints invalid price ! .

//D) in main, create a Book object with the tittle "Madol Doova", author "Martin Wickramasinghe" and price 850. Then try to set the price to -200 and print the book's details.

class Book{

    private String title;
    private String author;
    private double price;

    //getters

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    //setters

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(double price){
        if (price > 0){
            this.price = price;
        }else{
            throw new IllegalArgumentException("Price can't be zero or less than zero");
        }
    }

    //main method

    public static void main(String[] arg){
        
        Book book1 = new Book();

        book1.setTitle("Madol Doova");
        book1.setAuthor("Martin Wickramasinghe");
        book1.setPrice(850);

        String name = book1.getTitle();
        System.out.println(name);

        System.out.println(book1.getAuthor());

        System.out.println(book1.getPrice());
    }
}