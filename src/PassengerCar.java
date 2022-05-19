package specs;

public class PassengerCar extends specs.Vehicle {
    int countWheels = 4;

    public PassengerCar(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
        this.countWheels = countWheels;
    }
    //////////////////////////////////////////////////////////
    void wheels() {
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
        System.out.println("стоим в большой пробке");
    }
    public void stop() {
        System.out.println("Транспорт остановился");
        System.out.println("....Плавно.....");
    }

}