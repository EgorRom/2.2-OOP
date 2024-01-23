public class Car extends MotorTransport  {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на автомобиле "+ getModelName());
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель на легковом автомобиле " + getModelName());
    }


}

