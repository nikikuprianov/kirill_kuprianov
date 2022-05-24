public class Plane extends Vehicle implements Flyable{

    public Plane(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
    }
    ///////////////////////////////////////////////////////////////////
    public String toString(){
        return "Это самолёт модели " + getModel();
    }


    public void drive() {
        if(getFuel() == 0) {
            System.out.println("Бак пуст");
            return;
        }else
            System.out.println("Cамолет" + getModel() + " поехал");
    }
    public void stop() {
        System.out.println("Самолёт " + getModel() + " остановился");
    }

    @Override
    public void fly() {
        System.out.println("Самолёт " + getModel() + " взлетел");
    }

    @Override
    public void landing() {
        System.out.println("Самолёт " + getModel() + " приземлился");
    }
}
