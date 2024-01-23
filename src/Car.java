public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        if (getModelName() != null) {
            System.out.println("Обслуживаем " + getModelName());

            updateTyre();

            checkEngine();


        }
    }

}
