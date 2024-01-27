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
        updateTyre();
        checkEngine();
        System.out.println("Проверяем прицеп на грузовике " + getModelName());

    }


}

