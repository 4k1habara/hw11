import java.time.LocalDate;

public class Main {
    public static void checkLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void determineVersion(int clientsOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear && clientsOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < currentYear && clientsOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientsOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDays(int distance) {
        int days = 1;
        if (distance > 20) {
                days++;
        }
        if (distance > 60) {
                days++;
        }
        return days;
    }
    public static void main(String[] args) {
        //task1
        int year = 2024;
        checkLeap(year);

        //task2
        int clientsOS = 0;
        int clientDeviceYear = 2015;
        determineVersion(clientsOS, clientDeviceYear);

        //task3
        int deliveryDistance = 95;
        if (deliveryDistance < 100) {
            int days = calculateDays(deliveryDistance);
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("В данный район доставка не осуществляется");
        }
    }
}