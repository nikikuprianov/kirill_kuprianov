public class Main {
    public static void main(String[] args) {
        Vehicle passengerCar1 = new PassengerCar("BMW",90,30,true);
        Vehicle suv1 = new SUV("Chevrolet Camaro",80,false,40);
        Vehicle flyingCar1 = new FlyingCar("Bugaty Chiron",40,70,false);
        Vehicle Plane1 = new Plane("A380 House",860,50,false);



        Vehicle[] vehicle = {passengerCar1,suv1,flyingCar1,Plane1};

        TransportSorter ts = new TransportSorter(vehicle);
        ts.print();
        ts.sort();
    }
}
