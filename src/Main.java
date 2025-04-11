public class Main {
    public static String checkLeapYear(int year) {
        if ((year % 4 == 0) && year % 100 != 0 || year % 400 == 0) {
            return year + " год високосный ";
        } else {
            return year + " год не високосный ";
        }
    }
    public static void printDownLoadCorrectApp(int phoneSystem, int clientDeviceYear) {
        if (phoneSystem == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке ");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке ");}
        } else if (phoneSystem == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для android ");
            } else {
                System.out.println("Установите облегченную версию проложения для  android ");
            }
        }
    }
    public static void calculateDeliveryDays(int deliveryDistance) {
        int count;
        if (deliveryDistance <= 20) {
            count = 1;
            System.out.println("Потребуется дней: " + count);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            count = 2;
            System.out.println("Потребуется дней: " + count);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            count = 3;
            System.out.println("Потребуется дней: " + count);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {
        int year = 2021;
        System.out.println(checkLeapYear(year));
        int phoneSystem = 0;
        int clientDeviceYear = 2016;
        printDownLoadCorrectApp(phoneSystem,clientDeviceYear);
        int deliveryDistance = 50;
        calculateDeliveryDays(deliveryDistance);
    }






}
