public class SUV extends Vehicle{
    int countWheels = 4;

    public SUV(String model, int speed, boolean isDieselFuel, int fuel) {
        super(model, speed, fuel, isDieselFuel);
    }
    /////////////////////////////////////////////////////////////////
    public void wheels() {
        System.out.println(countWheels);
    }

    public String toString(){
        return " " + getModel();
    }

    private void checkFuel() {
        if (getFuel() > 100 || getFuel() < 0) {
            return;
        }
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
        System.out.println("Быстро едет по кочкам");
    }
    public void stop() {
        System.out.println("Транспорт остановился");
        System.out.println("....Резко.....");
    }

}