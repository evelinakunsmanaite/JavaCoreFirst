package first;

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

    public static void getArrayInfo() {
        int[] array = new int[100];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countZeroNumbers = 0;
        double sumZeroNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        for (int element : array) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
            if ((element % 10 == 0) || (element == 0)) {
                countZeroNumbers++;
                sumZeroNumbers += element;
            }
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countZeroNumbers);
        System.out.println("Сумма элементов, оканчивающихся на 0: " + sumZeroNumbers);
    }

    public static void multiDimensionalArrays() {
        int[][] array = new int[3][5];
        int sum = 0;
        int[] arrSum = new int[array.length];
        int max = Integer.MIN_VALUE;
        int indexMax = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 5);
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }

            System.out.println("Сумма: " + sum);
            arrSum[i] = sum;
            sum = 0;

            if (arrSum[i] > max) {
                max = arrSum[i];
                indexMax = i;
            }
        }

        System.out.println(Arrays.toString(arrSum));
        System.out.println("Максимальная сумма в строках: " + max);
        System.out.println("Индекс максимального значения: " + indexMax);

    }

    public static void getMaxSum() {
        int[] array = new int[10];
        int maxSum = Integer.MIN_VALUE;
        int sum, firstIndex = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        for (int i = 2; i < array.length; i++) {
            sum = array[i - 2] + array[i - 1] + array[i];
            if (sum > maxSum) {
                maxSum = sum;
                firstIndex = i - 2;
            }
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Максимальная сумма трёх соседних элементов: " + maxSum);
        System.out.println("Индекс первого из тройки, с максимальной суммой: " + firstIndex);
    }
}
