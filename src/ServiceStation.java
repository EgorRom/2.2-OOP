public class ServiceStation implements Transport{


    @Override
    public void service(Bicycle bicycle) {
        System.out.println("Обслуживаем велосипед " + bicycle.getModelName());

        for (int i=0;i< bicycle.wheelsCount; i++)
        System.out.println("Меняем покрышку на велосипеде " + bicycle.getModelName());



    }

    @Override
    public void service(Car car) {
        System.out.println("Обслуживаем автомобиль " + car.getModelName());
        for (int i=0;i< car.wheelsCount; i++){
            System.out.println("Меняем покрышку на автомобиле " + car.getModelName());
        }
        System.out.println("Проверяем двигатель " + car.getModelName());


    }

    @Override
    public void service(Truck truck) {
        System.out.println("Обслуживаем автомобиль " + truck.getModelName());
        for (int i=0;i< truck.wheelsCount; i++){
            System.out.println("Меняем покрышку на грузовике " + truck.getModelName());
        }
        System.out.println("Проверяем двигатель грузовика " + truck.getModelName());
        System.out.println("Проверяем прицеп на грузовике "+ truck.getModelName());

    }
}
