class cal{
    //reference var:
    int num1 = 20;
    int num2 = 5;

    //operations: + - / *


    void add(){ //non parametere | non return type
        int answer = (num1 + num2);
        System.out.println("Answer is : "+ answer);
    }

    void sub(int num1,int num2){ //with parameter | no return
        int answer = (num1-num2);
        System.out.println("The answer is :" + answer);
    }

    int mul(){ // non parameter | with return
        int answer = (num1 * num2);
        return answer;
    }

    int div(int num1, int num2){ // with parameter | with return
        int answer = (num1 / num2);
        return answer;
    }




    



    //main method:
    public static void main(String[] arg){

        // object
        cal obj1 = new cal();

        //method calling

        obj1.add();
        obj1.sub(18,5);
        int ans = obj1.mul();
        System.out.println("The answer is : "+ ans);
        int div = obj1.div(10,5);
        System.out.println("The answer is : "+div);

    }
}