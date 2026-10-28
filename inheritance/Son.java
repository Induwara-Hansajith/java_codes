//son class => child | sub class
public class Son extends Father{

    String laptop;
    String bike;

    public void code(){
        System.out.println("Code via : "+laptop);
    }

    public void travel(){
        System.out.println("Via " +bike);
    }

    @Override 
    void coding(){
        System.out.println("Dad do not code");
    }
}