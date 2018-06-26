import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập vào số hàng : ");
        int soHang = scanner.nextInt();

        System.out.println("Mời bạn nhập vào số phần tử : ");
        int soPhanTu = scanner.nextInt();

        int[][] bang = new int[soHang][soPhanTu];
        System.out.println("Mời bạn nhập vào các phần tử theo hàng : ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soPhanTu; j++) {
                System.out.println("Nhập phần tử thứ " + j + " của hàng " + i + " là :");
                bang[i][j] = scanner.nextInt();
            }
        }
        inMang(bang);
        System.out.println(timGiaTriLonNhat(bang));
    }

    static void inMang(int[][] array) {
        System.out.println("Bang cua ban la : ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int number = array[i][j];
                System.out.print(Integer.toString(number) + '\t');
            }
        }
        System.out.println();
    }

    static String timGiaTriLonNhat(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        String result = "Gia tri lon nhat cua mang la " + max;
        return result;
    }
}
