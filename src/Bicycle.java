public class Bicycle extends WheeledTransport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void service() {
        System.out.println("Обслуживаем велосипед " + getModelName());

        for (int i = 0; i < wheelsCount; i++)
            System.out.println("Меняем покрышку на велосипеде " + getModelName());


    }
}
