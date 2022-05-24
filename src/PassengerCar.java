public  class PassengerCar extends Vehicle{
    int countWheels = 4;

    public PassengerCar(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
        this.countWheels = countWheels;
    }
    //////////////////////////////////////////////////////////
    void wheels() {
        System.out.println(countWheels);
    }

    public String toString(){
        return "Это легковой автомобиль модели " + getModel();
    }

    /*private void checkFuel() {
        if (getFuel() > 100 || getFuel() < 0) {
            return;
        }
        System.out.println("Читар");
    }*/
    void GetModel() {
        System.out.println(getModel());
    }
    void drive() {
        if(getFuel() == 0) {
            System.out.println("Бак пуст");
            return;
        }else
            System.out.println("Транспорт поехал");
    }
    void stop() {
        System.out.println("Транспорт остановился");
        System.out.println("....Плавно.....");
    }

}