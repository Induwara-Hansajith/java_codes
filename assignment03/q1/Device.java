package assignment03.q1;

public class Device {
    String brand;
    String model;
    boolean isOn;

    public boolean turnOn(){
        isOn = true;
        return isOn;
    }

    public boolean turnOff(){
        isOn = false;
        return isOn;
    }

    public void info(){
        
        if (isOn == true){
            System.out.println("Brand : "+brand);
            System.out.println("Model : "+model+ " is now ON");
        }
        else{
            System.out.println("Brand : "+brand);
            System.out.println("Model : "+model+ " is now OFF");
        }
    }
}
