package specs;

public class TransportSorter{
    specs.Vehicle[] vehicles = {};
    public TransportSorter(specs.Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void sort() {
        for(specs.Vehicle ts: vehicles) {
            if(ts instanceof specs.PassengerCar) {
                System.out.println("\nТранспортное средство " + ts.getModel() + " отправляется в отдел легковых машин");
                ((specs.PassengerCar) ts).drive();
                ((specs.PassengerCar) ts).stop();

            }
            else if (ts instanceof specs.SUV) {
                System.out.println("\nТранспортное средство " + ts.getModel() + " отправляется в отдел грузовиков");
                ((specs.SUV) ts).drive();
                ((specs.SUV) ts).stop();
            }
            else if (ts instanceof specs.Motorcycle) {
                System.out.println("\nТранспортное средство " + ts.getModel() + " отправляется в отдел мотоциклов");
                ((specs.Motorcycle) ts).drive();
                ((specs.Motorcycle) ts).stop();
            }

        }
    }

    public void print() {
        for(specs.Vehicle ts: vehicles) {
            ts.GetModel();
        }

    }

}