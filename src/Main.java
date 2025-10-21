
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //case №1

        Random random = new Random();
        int clientOS  = random.nextInt(2 - 0);
        //System.out.println(clientOS);

        if (clientOS > 0) {
            System.out.println("Установите версию приложения для Android по ссылке \n");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке \n");
        }

        //case №2

        /** Генерим новый рандом, где 0 - система iOS, 1 - Android */
        Random random0 = new Random();
        int checkClientOS  = random.nextInt(2 - 0);
        //System.out.println(checkClientOS);

        Random random1 = new Random();
        int productionDate  = random.nextInt(2025 - 2012) + 2012;
        int clientDeviceYear = 2015;
        //System.out.println(productionDate);

        /** Проверка на тип системы и на дату её производства */
        if (checkClientOS > 0 && productionDate >= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке \n");
        } else if (checkClientOS > 0 && productionDate < clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке \n");
            } else if (checkClientOS == 0 && productionDate >= clientDeviceYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке \n");
                } else if (checkClientOS == 0 && productionDate < clientDeviceYear) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке \n");
        }

        //case №3
        /** Календарный год может быть високосным в двух случаях: он должен БЫТЬ КРАТНЫМ 4,
         * но при этом НЕ должен быть КРАТНЫМ 100, или год КРАТЕН 400 */

        Random random2 = new Random();
        int year  = random.nextInt(2025 - 1584) + 1584;
        //System.out.println(year);

        if (year < 1584) {
            System.out.println("Введённый год меньше 1584 года, когда был введён вискосный год");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year + " год является високосным \n");
            } else {
                System.out.println(year + " год не является високосным \n");
            }

        //case №4

        int deliveryDistance = 95;
        int deliveryTime = 0;

        if (deliveryDistance < 20) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime += 3;
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        } else {
            System.out.println("Доставки на такое расстояние нет \n");
        }

        //case №5

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас сезон зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас сезон весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас сезон лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас сезон осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }
    }
}