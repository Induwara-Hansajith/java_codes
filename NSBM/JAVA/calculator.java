package NSBM.JAVA;

class Calculator{
    //class scope

    //variables
    //value assigned variable
    int number1 = 10;

    void add(){
        int num1 = 5;
        int num2 = 10;

        System.out.println("Answer is: "+(num1+num2));
    }

    //value not assigned variable. later you can assign a value
    String name;

    //main method
    public static void main(String arg[]){
        //create an object
        //reference class | object = new constructor
        Calculator obj1; // => declaration
        obj1 = new Calculator(); //initialization

        // 1. Call the add method using the object
        obj1.add();

        // 2. Assign a value to the unassigned 'name' variable
        obj1.name = "My Java Calculator";
        System.out.println("Calculator name is: " + obj1.name);

        // 3. Print the pre-assigned 'number1' variable
        System.out.println("Number 1 is: " + obj1.number1);
    }
}