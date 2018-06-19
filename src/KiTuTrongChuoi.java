import java.util.Scanner;

public class KiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao chuoi cua ban: ");
        String string = sc.nextLine();
        System.out.println("Chuoi cua ban la: " + string);
        System.out.println("Ki tu can dem trong chuoi la: ");
        char c = sc.next().charAt(0);
        System.out.println(c);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char subChar = string.charAt(i);
            if (subChar == c) {
                count++;
            }
        }
        System.out.println("Kí tự " + c + " xuất hiện " + count + " lần.");
    }
}
