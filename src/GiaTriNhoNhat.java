import java.util.Scanner;

public class GiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay nhap do dai cua mang");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            int counter = i;
            counter++;
            System.out.println("Hay nhap phan tu thu " + counter + " cua mang");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        if (array.length == 1) {
            min = array[0];
        }
        System.out.println("Gia tri nho nhat trong mang la: " + min);
    }
}
