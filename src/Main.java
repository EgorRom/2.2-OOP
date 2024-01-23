public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.service(bicycle);
        serviceStation.service(bicycle2);
        System.out.println();
        serviceStation.service(car);
        serviceStation.service(car2);
        System.out.println();
        serviceStation.service(truck);
        serviceStation.service(truck2);
        System.out.println("Выполнение отдельных видов работ по транспорту ");
        truck2.checkTrailer();
        bicycle.updateTyre();
        car2.checkEngine();
        car.updateTyre();




    }
}