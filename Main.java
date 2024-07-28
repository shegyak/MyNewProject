import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення імені з клавіатури
        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine();

        // Введення віку з клавіатури
        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();

        // Перевірка віку
        if (age >= 18 && age <= 26) {
            System.out.println(name + ", з'явіться до військкомату");
        }

        scanner.close();
    }