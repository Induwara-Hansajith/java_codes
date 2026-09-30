class Book{

    String title;
    double price;

    public static void main(String[] args){
        Book book1 = new Book();

        book1.title = "Harry Potter";
        book1.price = 2500;


        System.out.println("Book name : " +book1.title);
        System.out.println("Price : " +book1.price);
    }
}