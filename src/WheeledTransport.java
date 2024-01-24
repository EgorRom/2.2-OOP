 abstract class WheeledTransport extends ServiceStation {
     public String modelName;
     public int wheelsCount;

     public WheeledTransport(String modelName, int wheelsCount) {
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

     public void updateTyre() {
         System.out.println("Меняем покрышку на  " + getModelName());
     }

     @Override
     public String toString() {
         return "WheeledTransport{" +
                 "modelName='" + modelName + '\'' +
                 ", wheelsCount=" + wheelsCount +
                 '}';
     }
 }
