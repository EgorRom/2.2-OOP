public class Truck extends MotorTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике " + getModelName());
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель на грузовике " + getModelName());
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп на грузовике "+ getModelName());
    }

}

