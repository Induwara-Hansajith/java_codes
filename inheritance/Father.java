//farther class => parent | super calss

abstract class Father extends Gfather{

    String car;
    String phone;

    public void travel(){
        System.out.println("Travel via : "+car);
    }

    public void call(){
        System.out.println("Call with : "+phone);
    }

    abstract void coding();

}