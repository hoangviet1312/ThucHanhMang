import java.util.Scanner;

public class CoCaRo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean luotCuaX = true;

        System.out.println("Ban hay nhap so cot: ");
        int soCot = sc.nextInt();

        System.out.println("Ban hay nhap so hang: ");
        int soHang = sc.nextInt();

        String[][] bang = new String[soCot][soHang];
        for (int j = 0; j < bang.length; j++) {
            for (int i = 0; i < bang[j].length; i++) {
                bang[j][i] = "   |";
            }
        }

        String caDong = "   |";
        String dongKe = "    -";
        String stt = "      ";

        for (int i = 0; i < soCot; i++) {
            dongKe += "----";
        }
        for (int i = 0; i < soCot; i++) {
            if (i < 10) {
                stt = stt + i + "   ";
            } else {
                stt = stt + i + "  ";
            }
        }
        System.out.println(stt);
        int x;
        int y;

        for (int luotChoi = 0; luotChoi < soCot * soHang; luotChoi++) {
            for (int j = 0; j < bang.length; j++) {
                String soThuTu = Integer.toString(j);
                if (j < 10) {
                    caDong = soThuTu + "   |";
                } else {
                    caDong = soThuTu + "  |";
                }
                for (int i = 0; i < bang[j].length; i++) {
                    caDong += bang[j][i];
                }
                System.out.println(dongKe);
                System.out.println(caDong);
            }
            System.out.println(dongKe);
            if (luotCuaX) {
                System.out.println("Luot cua x: ");
                System.out.println("Nhap vao toa do muon danh: ");
                System.out.println("Nhap x: ");
                x = sc.nextInt();
                System.out.println("Nhap y: ");
                y = sc.nextInt();
                bang[x][y] = "  X|";
                luotCuaX = !luotCuaX;
            } else {
                System.out.println("Luot cua o: ");
                System.out.println("Nhap vao toa do muon danh: ");
                System.out.println("Nhap x: ");
                x = sc.nextInt();
                System.out.println("Nhap y: ");
                y = sc.nextInt();
                bang[x - 1][y - 1] = "   O|";
                luotCuaX = !luotCuaX;
            }
        }
    }
}
