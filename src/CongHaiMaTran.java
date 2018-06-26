import java.util.Scanner;

public class CongHaiMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chuong trinh tinh tong hai ma tran");
        System.out.println("Hay nhap kich thuoc cua hai ma tran: ");

        System.out.println("So hang la: ");
        int soHang = scanner.nextInt();

        System.out.println("So phan tu trong hang la: ");
        int soPhanTu = scanner.nextInt();

        int[][] maTran_1 = new int[soPhanTu][soHang];
        int[][] maTran_2 = new int[soPhanTu][soHang];

        askData(maTran_1, 1, scanner);
        askData(maTran_2, 2, scanner);

        inMang(maTran_1, "1");
        inMang(maTran_2, "2");

        int[][] result = congMang(maTran_1, maTran_2);
        inMang(result, "ket qua");
    }

    static void inMang(int[][] array, String soBang) {
        System.out.println("Bang " + soBang);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int number = array[i][j];
                System.out.print(Integer.toString(number) + '\t');
            }
        }
        System.out.println();
    }

    static void askData(int[][] array, int bangSo, Scanner scanner) {
        System.out.println("Nhap cac gia tri cua ma tran " + bangSo);
        for (int b = 0; b < array.length; b++) {
            System.out.println("Hang so: " + (b + 1));
            for (int c = 0; c < array[b].length; c++) {
                System.out.println("Phan tu thu " + (c + 1) + " trong hang " + (b + 1) + " la: ");
                array[c][b] = scanner.nextInt();
            }
        }
    }

    static int[][] congMang(int[][] array_1, int[][] array_2) {
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_1[i].length; j++) {
                array_1[i][j] += array_2[i][j];
            }
        }
        return array_1;
    }
}
