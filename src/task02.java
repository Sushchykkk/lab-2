import java.util.Scanner;
public class task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть координату x: ");
        double x = scanner.nextDouble();

        System.out.print("Введіть координату y: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться в першому квадранті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться в другому квадранті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться в третьому квадранті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться в четвертому квадранті.");
        } else {
            System.out.println("Точка знаходиться на координатній вісі.");
        }

        scanner.close();
    }
}