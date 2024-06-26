import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i + ":");
            String name = scanner.next();
            int velocity;
            while (true) {
                System.out.println("Введите скорость машины №" + i + ":");
                if (scanner.hasNextInt()) {
                    velocity = scanner.nextInt();
                    if (0 < velocity & velocity <= 250) {
                        break;
                    } else {
                        System.out.println("Неправильная скорость");
                    }
                } else {
                    System.out.println("Неправильная скорость");
                    scanner.next();
                }
            }
            Car car = new Car(name, velocity);
            race.isLeader(car);
        }
        System.out.println("Самая быстрая машина: " + race.getLeaderName());
        scanner.close();
    }
}
