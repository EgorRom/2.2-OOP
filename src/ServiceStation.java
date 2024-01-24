public class ServiceStation implements Transport {


    //@Override
    public void service(Transport transport) {
        System.out.println("Проводим полное ТО по регламенту " + transport);

    }
}
