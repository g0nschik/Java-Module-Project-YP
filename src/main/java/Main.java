import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Это наш гараж
        ArrayList<Cars> carsInRace = new ArrayList<>();

        // Запрашиваем 3 машины
        for(int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины " + i);
            String name = scanner.nextLine();
            carsInRace.add(new Cars(name, getSpeed(i)));
        }

        // Нфчинаем гонку!
        Race race = new Race(carsInRace);
        System.out.println("Самая быстрая машина: " + race.leader.name + ", проехала "
                + (race.leader.speed * 24) + " км за 24 часа");
    }

    public static int getSpeed(int num) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Введите скорость машины " + num + " (от 1 до 250)");
            int speed = scanner.nextInt();

            if (speed < 0) {
                System.out.println("Ошибка: скорость должна быть больше 0!");
            }
            else if (speed > 250) {
                System.out.println("Ошибка: скорость должна быть меньше 250!");
            }
            else {
                return speed;
            }
        }
    }
}