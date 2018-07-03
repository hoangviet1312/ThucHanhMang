import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = initializeArray("first", scanner);
        int[] secondArray = initializeArray("second", scanner);

        int[] finalArray = plusArray(firstArray, secondArray);
        printArray(finalArray);
    }

    private static int[] plusArray(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i < result.length - array2.length; i++) {
            result[i] = array1[i];
        }

        for (int i = array1.length; i < result.length; i++) {
            result[i] = array2[i - array1.length];
        }
        return result;
    }

    private static int[] initializeArray(String name, Scanner scanner) {
        System.out.println("The " + name + " array size is:");
        int[] array = new int[askSize(scanner)];
        askData(array, scanner);
        printArray(array);
        System.out.println();
        return array;
    }

    private static void printArray(int[] array) {
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void askData(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    private static int askSize(Scanner scanner) {
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size does not exceed 10");
        } while (size > 10);

        return size;
    }
}
