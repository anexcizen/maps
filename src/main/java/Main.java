import ru.route.*;
import ru.transport.*;

public class Main {
    public static void main(String[] args) {
        Train train = new Train();
        Plane plane = new Plane();
        Bus bus = new Bus();
        Car car = new Car();
        Route route = new Route("Казань", "Москва", "11:00", "19:11", 838, car);
        System.out.println(route);
    }
}
