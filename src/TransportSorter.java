public class TransportSorter{
    Vehicle[] vehicles = {};
    public TransportSorter(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void sort() {
        for(Vehicle ts: vehicles) {
            if(ts instanceof PassengerCar) {
                System.out.println("\n" + ts.toString());
                System.out.println("Транспортное средство " + ts.getModel() + " отправляется в отдел легковых машин");
                ((PassengerCar) ts).drive();
                ((PassengerCar) ts).stop();
            }
            else if (ts instanceof SUV) {
                System.out.println("\n" + ts.toString());
                System.out.println("Транспортное средство " + ts.getModel() + " отправляется в отдел джипов");
                ((SUV) ts).drive();
                ((SUV) ts).stop();
            }

            else if(ts instanceof FlyingCar) {
                System.out.println("\n" + ts.toString());
                System.out.println("Транспортное средство " + ts.getModel() + " отправляется в отдел летающих транспортных средств");
                ts.drive();
                ((FlyingCar) ts).fly();
                ((FlyingCar) ts).landing();
                ts.stop();
            }
            else if(ts instanceof Plane) {
                System.out.println("\n" + ts.toString());
                System.out.println("Транспортное средство " + ts.getModel() +" отправляется в отдел летающих транспортных" +
                        " средств");
                ((Plane) ts).drive();
                ((Plane) ts).fly();
                ((Plane) ts).landing();
                ((Plane) ts).stop();
            }


        }
    }

    public void print() {
        for(Vehicle ts: vehicles) {
            ts.GetModel();
        }

    }

}