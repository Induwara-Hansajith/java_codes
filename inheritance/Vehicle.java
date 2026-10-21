// Create a class called Vehicle with the following:
// i. Fields: brand (String), year (int)
// ii. A constructor Vehicle (String brand, int year) that initializes the fields and prints: "Vehicle created: [brand]"
// iii. A method showDetails () that prints: "Brand: [brand], Year: [year]"
// Create a class called Car that extends Vehicle:
// i. Field: doors (int)
// ii. A constructor Car (String brand, int year, int doors) that calls super (brand, year) and prints: "Car created with [doors] doors" 
// iii. Override showDetails (). Call super. showDetails () first, then print: "Doors: [doors]"
// a. In main (): Create a Car object and call showDetails ()

class Vehicle{

    String brand;
    int year;

    Vehicle(String brand, int year){

        this.brand = brand;
        this.year = year;

        System.out.println("Vehicle created : " +brand);
    }

    void showDetails(){
        System.out.print("Brand : " +brand+ ", Year : "+year);   
    }
} 

class Car extends Vehicle{

    int doors;


    Car(String brand, int year, int doors){
        super(brand, year);
        this.doors = doors;

        System.out.println("Car created with "+doors+" doors.");
    }

    void showDetails(){
        super.showDetails();
        System.out.println("Doors : "+doors);
    }
}

class CarTest{

    public static void main(String[] arg){

        Car c1 = new Car("Toyota", 2025, 4);

        c1.showDetails();
    }
}