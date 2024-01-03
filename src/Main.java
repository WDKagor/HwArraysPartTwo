import java.util.Arrays;

public class Main {
    private static Object Arrays;
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
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
}