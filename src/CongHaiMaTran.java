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

        for (int a = 1; a <= 2; a++) {
            System.out.println("Nhap cac gia tri cua ma tran " + a);
            for (int b = 0; b < soHang; b++) {
                System.out.println("Hang so: " + (b + 1));
                for (int c = 0; c < soPhanTu; c++) {
                    System.out.println("Phan tu thu " + (c + 1) + " trong hang " + (b + 1) + " la: ");
                    if (a == 1) {
                        maTran_1[c][b] = scanner.nextInt();
                    } else {
                        maTran_2[c][b] = scanner.nextInt();
                    }
                }
            }
        }
        inMang(maTran_1);
        inMang(maTran_2);
    }

    static void inMang(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int number = array[i][j];
                System.out.print(Integer.toString(number) + '\t');
            }
        }
        System.out.println();
    }
}
