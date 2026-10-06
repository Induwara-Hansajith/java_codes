class Rectangle{

    double length;
    double width;
    
    Rectangle(){
        length = 1;
        width = 1;
    }

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    void setSize(double lentgth, double width){
        this.length = length;
        this.width = width;
    }

    void display(){
        System.out.println("The length of the tile : "+length);
        System.out.println("The width of the tile : "+width);
    }

    double getArea(){
        return length * width;
    }

    double getCost(double pricePerUnit){
        return getArea() * pricePerUnit;
    }
}


class RectangleTest{

    public static void main(String[] arg){

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 3);

        System.out.println("Tile 01");
        r1.display();
        System.out.println("Area : "+r1.getArea());

        System.out.println("");

        System.out.println("Tile 02");
        r2.display();
        System.out.println("Area : "+r2.getArea());

        System.out.println("");

        //set sizes to r1

        r1.setSize(4,2);
        System.out.println("Tile 01");
        r1.display();
        System.out.println("Area : "+r1.getArea());

        System.out.println("");

        //cost of r2

        System.out.println("Cost of tiling r2 : "+r2.getCost(150)+" per square meter.");

    }
}