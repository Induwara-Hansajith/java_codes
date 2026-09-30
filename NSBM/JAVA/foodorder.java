//create a java class name food order contain variables customer name, food item , unit price and quantity.
//create a non parameterized non return method named displayOrder() to display all the order details .
//a parameterzied non return type method name update quantity (int new quantity) to update the quantity.
//a non parameterized return method calculate sub total to calculate and return sub total .
//a parameterized return type method calculate final total (double discountPerscentage) to calculate and return final total after applying discount.

class food_order{
    
    String Customer_name;
    String food_item;
    int unit_price;
    int quantity;

    void DisplayOrder(){
        System.out.println("***************");
        System.out.println("Order Details");
        System.out.println("***************");

        System.out.println("Customer Name: "+Customer_name);
        System.out.println("Food Item: "+food_item);
        System.out.println("Quantity: "+quantity);
        System.out.println("Unit Price: "+unit_price);
    }

    void quantity(int newquantity){
        quantity = newquantity;
    }

    double calculatesubtotal(){
        double subtotal = (unit_price * quantity);
        return subtotal;
    }

    double calculatefinaltotal(double discountpercentage){
        double subtotal = calculatesubtotal();
        double discount = (subtotal * discountpercentage) /100;
        double finaltotal = subtotal - discount; 
        return finaltotal;
    }



     public static void main(String[] args){
        food_order obj = new food_order();

        obj.Customer_name = "Demkika Fernando";
        obj.food_item = "Mexican Biriyani";
        obj.quantity(5);
        obj.unit_price = 15000;

        obj.DisplayOrder();
        obj.calculatesubtotal();
        obj.calculatefinaltotal(5);

        System.out.println(obj.Customer_name + " Thank you for being a part of cinnamon life");

    }

}
