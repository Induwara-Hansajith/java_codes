class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    // Non-parameterized constructor
    Product() {
        productId = 55456;
        productName = "Lenovo Gaming Laptop";
        price = 750000.0;
        quantity = 10;
    }

    // Parameterized constructor
    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }


    double calculateTotal() {
        return price * quantity;
    }

   
    void displayProduct() {
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Available Quantity : " + quantity);
        System.out.println("The total is : " + calculateTotal());
       
    }

    public static void main(String[] args) {
        
        Product product1 = new Product();
        product1.displayProduct();

        System.out.println();
       
        Product product2 = new Product(77821, "Wireless Mouse", 1500.0, 5);
        product2.displayProduct();
    }
}