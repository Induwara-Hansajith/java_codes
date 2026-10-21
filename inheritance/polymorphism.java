//@Overloading
// create a class called calculator with the following methods,
// 1. Add(int a, int b) return sum of two intigers and print output.
// 2. Add(double a, double b)

class Calculator{

    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

}

class CalculatorTest{

    Calculator nd = new Calculator();

    public void main(String[] arg){
        System.out.println("The sum is : " +nd.add(5,3));

        System.out.println("The sum is : "+nd.add(5.2, 3.3));
    }


}