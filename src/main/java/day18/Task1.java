package day18;

public class Task1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2};

        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] numbers, int index) {

        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + recursionSum(numbers, index + 1);
    }
}
