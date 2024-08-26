import java.util.ArrayList;

public class Race {
    Cars leader;

    public Race(ArrayList<Cars> allCars) {
        int totalPath = 0;

        for (Cars car : allCars) {
            int path = car.speed * 24;
            if (totalPath < path) {
                totalPath = path;
                leader = car;
            }
            // System.out.println("Машина " + car.name + ", скорость " + car.speed);
        }
    }
}
