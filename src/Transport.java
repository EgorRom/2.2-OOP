public class Transport implements ServiceStation {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }


    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку на " + getModelName());
        }

    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель на " + getModelName());

    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп на " + getModelName());

    }

    public void check() {
        if (getModelName() != null) {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
                break;
            }
            checkEngine();
            checkTrailer();


        }
    }
}
