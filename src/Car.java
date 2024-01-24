public class Car extends MotorTransport  {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем автомобиль " + getModelName());
        for (int i=0;i< wheelsCount; i++){
            System.out.println("Меняем покрышку на автомобиле " + getModelName());
        }
        System.out.println("Проверяем двигатель " + getModelName());

    }
}

