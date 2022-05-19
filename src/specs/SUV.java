package specs;

public class SUV extends specs.Vehicle {
    int countWheels = 4;

    public SUV(String model, int speed, boolean isDieselFuel, int fuel) {
        super(model, speed, fuel, isDieselFuel);
    }
    /////////////////////////////////////////////////////////////////
    public void wheels() {
        System.out.println(countWheels);
    }


    private void checkFuel() {
        if (getFuel() > 100 || getFuel() < 0) {
            return;
        }
        System.out.println("Читер");
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
        System.out.println("срезаем дорогу");
    }
    public void stop() {
        System.out.println("Транспорт остановился");
        System.out.println("....быстро.....");
    }

}