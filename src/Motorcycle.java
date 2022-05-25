package specs;

public class Motorcycle extends specs.Vehicle {
    int countWheels = 2;

    public Motorcycle(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
        this.countWheels = countWheels;
    }
    /////////////////////////////////////////////////////////////////
    void wheels() {
        System.out.println(countWheels);
    }


    void GetModel() {
        System.out.println(getModel());
    }
    public void drive() {
        if(getFuel() == 0) {
            System.out.println("Бак пуст");
            return;
        }else
            System.out.println("Транспорт поехал");
        System.out.println("Удобно проезжаем между машинами");
    }
    public void stop() {
        System.out.println("Транспорт остановился");
        System.out.println("....плавно.....");
    }

}
