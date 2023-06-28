import java.util.Arrays;

public class SecondTask {
    public static void createArrayAndGetInfo(int arrayLength) {
        int countMoreEight = 0, countOne = 0, countEven = 0, countOdd = 0, sum = 0;
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);

            if (array[i] > 8) {
                countMoreEight++;
            } else if (array[i] == 1) {
                countOne++;
            }

            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            sum += array[i];
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("\nИнформация о массиве:");
        System.out.println("\nДлина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + countMoreEight);
        System.out.println("Количество чисел равное 1: " + countOne);
        System.out.println("Количество чётных чисел: " + countEven);
        System.out.println("Количество нечётных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
