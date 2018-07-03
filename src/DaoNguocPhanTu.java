import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        int[] initArray = new int[size];
        askData(initArray, scanner);

        System.out.printf("%-20s%s", "Elements in array: ", "");
        printArray(initArray);

        reversePlace(initArray);

        System.out.printf("%-20s%s", "Reverse array: ", "");
        printArray(initArray);
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void reversePlace(int[] array) {
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
    }

    static void askData(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

}
