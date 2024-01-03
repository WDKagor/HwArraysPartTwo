import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Object Arrays;
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxCost = -1;
        int minCost = 201000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxCost) {
                maxCost = arr[i];
            }
            if (arr[i]<minCost) {
                minCost = arr[i];
            }
        }
        System.out.println("Минимальная сумма трата за день составила " + minCost + " рублей");
        System.out.println("Максимальная сумма трата за день составила " + maxCost + " рублей");
            }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        double averageCosts = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            averageCosts = sum / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageCosts + " рублей");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length-1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
    }
}