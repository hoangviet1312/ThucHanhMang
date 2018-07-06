import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] initArray = initializeArray(scanner);

        System.out.println("Nhap vao vi tri can xoa:");
        int index = scanner.nextInt();

        if (index < 0 || index > initArray.length) {
            System.out.println("Vi tri khong hop le:");
        } else {
            initArray = removeValue(initArray, index);
            printArray(initArray);
        }
    }

    private static int[] initializeArray(Scanner scanner) {
        System.out.println("The array size is:");
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
            if (size > 10) {
                System.out.println("Size does not exceed 10");
            }
        } while (size > 10);

        return size;
    }

    private static int[] removeValue(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[counter] = array[i];
            counter++;
        }
        return newArray;
    }
}
