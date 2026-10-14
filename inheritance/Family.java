public class Family{

    public static void main (String[] args){

        Father f1 = new Father();
        f1.car = "mini";
        f1.phone = "Nokia 1100";
        f1.travel();
        f1.call();

        Son s1 = new Son();
        s1.laptop = "HP";
        s1.code();

        s1.car = "Toyota";

        Dau d1 = new Dau();
        d1.bike = "Bike";
        d1.ride();


    }
}