// question?

// a simple number analisis system use to pre-define intiger values develop a java program named number analiser to perform following operations.
// 1. calculate and display the addition of two numbers.
// 2. determine whether a given number is odd or even.
// 3. find and return the larger number of pre-defined two numbers.
// 4. calculate and return the square of given number.
// 5. display all the results in main method.



class analiser{


    int num1 = 100;
    int num2 = 20;

    // addition
    void add(){
        int ans = (num1 + num2);
        System.out.println("Addition between "+num1+" and "+num2+" is : "+ans);
    }

    // odd / even checker

    void check(){
       int x = (num1%2);
       int y = (num2%2);

        if (x==0){
            System.out.println(num1+ " is even");
        }
        if (y==0){
            System.out.println(num2+ " is even");
        }
    }

    // large number finder

    void max(){
        if(num1 > num2){
            System.out.println(num1+ " is greater than "+num2);
        }
        else if(num1 == num2){
            System.out.println("Both numbers are equal");
        }
        else{
            System.out.println(num2+ " is greater than "+num1);
        }
    }

    //finding square

    void square(){
        int x = (num1 * num1);
        int y = (num2 * num2);

        System.out.println("Square of "+num1+" is "+x);
        System.out.println("Square of "+num2+" is "+y);
    }



    static void main(String[] arg){

        analiser obj2 = new analiser();

        obj2.add();
        obj2.check();
        obj2.max();
        obj2.square();
    }

}