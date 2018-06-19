import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students_name = {"Nghiem", "Minh", "Viet", "Hue", "Minh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten sinh vien :");
        String name = sc.nextLine();
        boolean kiemtra = false;
        for (int i = 0; i < students_name.length; i++) {
            if (students_name[i].equals(name)) {
                System.out.println("Sinh Vien này có trên hệ thống!");
                kiemtra = true;
                break;
            }
        }
        if (!kiemtra) {
            System.out.println("Sinh viên không có trên hệ thống !");
        }
    }
}
