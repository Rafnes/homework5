public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        //Задание 2
        int clientDeviceYear = 2015;
        int thisDeviceProductionYear = 2014;
        if (clientOS == 0) {
            if (thisDeviceProductionYear < clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (thisDeviceProductionYear < clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        else {
            System.out.println("Неизвестный идентификатор ОС");
        }
        System.out.println();

        //Задание 3
        int year = 1984;
        boolean isFourth = year % 4 == 0;
        boolean isHundredth = year % 100 == 0;
        boolean isFourHundredth = year % 400 == 0;
        if (year < 1584) {
            System.out.println("Високосный год еще не ввели");
        }
        else if (isFourHundredth) {
            System.out.println(year + " год является високосным");
        }
        else if (isFourth && !isHundredth) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        //Задание 4
        int deliveryDistance = 90;
        int daysToDeliver = 0;
        if (deliveryDistance <= 20) {
            daysToDeliver++;
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysToDeliver += 2;
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else if (deliveryDistance <= 100) {
            daysToDeliver += 3;
            System.out.println("Потребуется дней: " + daysToDeliver);
        }
        else {
            System.out.println("Доставка на расстояние больше 100 км недоступна");
        }
        System.out.println();

        //Задание 5
        int monthNumber = 5;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Этот месяц относится к зиме");
                break;
            case 3, 4, 5:
                System.out.println("Этот месяц относится к весне");
                break;
            case 6, 7, 8:
                System.out.println("Этот месяц относится к лету");
                break;
            case 9, 10, 11:
                System.out.println("Этот месяц относится к осени");
                break;
            default:
                System.out.println("Такого по счету месяца не существует");
        }
    }
}