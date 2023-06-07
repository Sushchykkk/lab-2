import java.util.Scanner;
public class task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2;

        System.out.println("Оберіть дію:");
        System.out.println("1. Обчислити добуток двох чисел");
        System.out.println("2. Обчислити суму двох чисел");
        System.out.println("3. Обчислити різницю двох чисел");

        choice = scanner.nextInt();

        System.out.println("Введіть перше число:");
        num1 = scanner.nextDouble();

        System.out.println("Введіть друге число:");
        num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Добуток чисел " + num1 + " та " + num2 + " дорівнює " + (num1 * num2));
                break;
            case 2:
                System.out.println("Сума чисел " + num1 + " та " + num2 + " дорівнює " + (num1 + num2));
                break;
            case 3:
                System.out.println("Різниця чисел " + num1 + " та " + num2 + " дорівнює " + (num1 - num2));
                break;
            default:
                System.out.println("Некоректний вибір!");
        }
    }
}
