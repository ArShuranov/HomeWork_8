public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("task1");

        int[] arr = generateRandomArray();
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2");

        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];

        for (int element : arr) {

            if (min > element) {
                min = element;
            }

            if (max < element) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
    }

    public static void  task3() {
        System.out.println();
        System.out.println("task3");

        int[] arr = generateRandomArray();
        double sum = 0;

        for (int element : arr) {
            sum += element;
        }
        System.out.println("Средняя сумма трат за месяц составила: " + sum / arr.length + " рублей");

    }

    public static void task4() {
        System.out.println();
        System.out.println("task4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}