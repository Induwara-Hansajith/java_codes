class rectangle{
    double length;
    double width;

    void displayDetails(){
        System.out.println("The length of the rectangle is : " +length);
        System.out.println("The width of the rectangle is : " +width);
    }

    double calculateArea(){
        double area = (length * width);

        return area;
    }

    public static void main(String[] args){
        rectangle rectangle1 = new rectangle();

        rectangle1.length = 20;
        rectangle1.width = 50;
       
        double area = rectangle1.calculateArea();
        rectangle1.displayDetails();
        System.out.println("The area of the rectangle is : " +area);
    }
}