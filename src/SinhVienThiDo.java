import java.util.Scanner;

public class SinhVienThiDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập vào số Sinh Viên: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Số lượng Sinh Viên quá giới hạn !");
            }
        } while (size > 30);
        int[] soDiem = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Số điểm của học sinh thứ " + (i + 1) + " là:");
            soDiem[i] = sc.nextInt();
        }
        for (int i = 0; i < soDiem.length; i++) {
            System.out.println("Số điểm học sinh thứ " + (i + 1) + " là: " + soDiem[i]);
        }
        System.out.println("---------------------------");
        System.out.println("Danh sách học sinh đỗ là : ");
        for (int i = 0; i < soDiem.length; i++) {
            if (soDiem[i] >= 5) {
                System.out.println("Sinh viên thứ " + (i + 1) + " đã đỗ với số điểm là: " + soDiem[i]);
            }
        }
    }
}
