public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        if (getModelName() != null) {
            System.out.println("Обслуживаем " + getModelName());
            updateTyre();


        }
    }

}
