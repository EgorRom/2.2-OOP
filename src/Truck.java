public class Truck extends MotorTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkTrailer() {
        System.out.println("Проверяем прицеп на грузовике " + getModelName());
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем автомобиль " + getModelName());
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку на грузовике " + getModelName());
        }
        System.out.println("Проверяем двигатель грузовика " + getModelName());
        System.out.println("Проверяем прицеп на грузовике " + getModelName());

    }


}

