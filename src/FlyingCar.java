public class FlyingCar extends PassengerCar implements Flyable{
    public FlyingCar(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
    }
    //////////////////////////////////////////////////////////
    public String toString(){
        return "Это летающая машина модели " + getModel();
    }

    @Override
    public void fly() {

        System.out.println("Птица " + getModel() + " взлетела");
    }
    @Override
    public void landing() {

        System.out.println("Птица" + getModel() + " приземлилась мягко");
    }

}