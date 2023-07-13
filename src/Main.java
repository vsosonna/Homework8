import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        task1();
        //task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int a = 0; a < numbers.length; a++) {
            if (a == numbers.length - 1) {
                System.out.println(numbers[a]);
                break;
            }
            System.out.print(numbers[a] + ",");

        }

        float[] numbersFractional = {1.57f, 7.654f, 9.986f};
        for (int b = 0; b < numbersFractional.length; b++) {
            if (b == numbersFractional.length - 1) {
                System.out.println(numbersFractional[b]);
                break;
            }
            System.out.print(numbersFractional[b] + ",");
        }
        String[] nome = {"Аня", "Вика", "Петя", "Женя" };
        System.out.println(Arrays.toString(nome));
    }

    private static void task3() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == numbers.length) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ",");
        }
        System.out.println();

        double[] numbersFractional = {1.57d, 7.654d, 9.986d};
        for (int x = numbersFractional.length - 1; x >= 0; x--) {
            if (x == 0 ) {
                System.out.print(numbersFractional[x]);
                break;
            }
            System.out.print(numbersFractional[x] + ",");
        }
        System.out.println();

    }

    private static void task4() {
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int b = 0; b < numbers1.length; b++) {
            if (numbers1[b] % 2 != 0) {
                numbers1[b]++;
                System.out.print(numbers1[b] + " ");
            }
        }

    }
}