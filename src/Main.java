public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        car.service();
        System.out.println();
        car2.service();
        System.out.println();
        bicycle.service();
        System.out.println();
        bicycle2.service();
        System.out.println();
        truck.service();
        System.out.println();
        truck2.service();
        System.out.println("Выполнение отдельных видов работ по транспорту ");
        truck2.checkTrailer();
        bicycle.updateTyre();
        car2.checkEngine();
        car.updateTyre();



    }
}