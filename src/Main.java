import java.time.LocalDate;

public class Main {

    public static void calculateLeapYear(int year) {//метод для решения первой задачи
        boolean dividesByFour = (year % 4) == 0;
        boolean dividesByHundred = (year % 100) == 0;
        boolean dividesByFourHundred = (year % 400) == 0;
        if ((dividesByFour && !dividesByHundred) || dividesByFourHundred) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " НЕ високосный");
        }
    }

    public static void selectAppVersion(int clientOS, int clientDeviceYear) {//метод для решения второй задачи
        int currentYear = 2022;

        if (clientDeviceYear == currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            System.out.println("Приложение работает корректно");
        } else {
            if (clientOS == 0) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            }
        }
    }

    public static String calculateQuantityOfDays(int deliveryDistance) {//метод для решения третьей задачи
        if (deliveryDistance <= 20) {
            return "Потребуется дней: 1";
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return "Потребуется дней: 2";
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return "Потребуется дней: 3";
        } else {
            return "Так далеко мы не возим!";
        }
    }


    public static void main(String[] args) {

        System.out.println("Task 1");
        calculateLeapYear(2000);
        System.out.println();

        System.out.println("Task 2");
        selectAppVersion(1,2022);
        System.out.println();

        System.out.println("Task 3");
        System.out.println(calculateQuantityOfDays(33));


    }
}