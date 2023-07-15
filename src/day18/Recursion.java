package day18;

public class Recursion {
    static int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
    static int sum = 0;
    static int count = 0;


    public static void recursionSum(int number) {
        if (number == numbers.length) {
            System.out.println("Cумма: " + sum);
        } else {
            sum += numbers[number];
            recursionSum(number + 1);
        }
    }

    public static int count7(int number) {
        if (number == 0) {
            return 0;
        } else if (number % 10 == 7) {
            count++;
        }
        count7(number / 10);

        return count;
    }
}
