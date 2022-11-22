import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        int year = 2024;
        boolean leapYear = isLeapYear(year);
        printYearInfo(year, leapYear);

        // Задание 2
        System.out.println("Задание 2");

        int clientOS1 = 0;
        int clientDeviceYear = 2022;
        printInfoAboutDevice(clientOS1, clientDeviceYear);

        // Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 59;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }
    private static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance > startInterval) {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        return deliveryDays;
    }

    private static String getOsByType(int clientOS1) {
        if (clientOS1 == 1) {
            return "Android";
        } else {
            return "iOS";
        }
    }

    private static String getTypeOfVersion(int clientDeviceYear) {
       int currentYear = LocalDate.now().getYear();
       if(clientDeviceYear == currentYear) {
           return "обычную";
       } else {
           return "lite";
       }
    }

    private static void printInfoAboutDevice(int clientOS1, int clientDeviceYear) {
        String os = getOsByType(clientOS1);
        String typeOfVersion = getTypeOfVersion(clientDeviceYear);
            System.out.println("Установите версию приложения " + typeOfVersion + " для " + os);
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printYearInfo(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println("Год " + year + " - високосный");
        } else {
            System.out.println("Год " + year + " - Не високосный");
        }
    }
}