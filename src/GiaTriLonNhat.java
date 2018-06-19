import java.util.Scanner;

public class GiaTriLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời ban nhap vao so chu so: ");
        int numbers = sc.nextInt();

        int[] array = new int[numbers];
        String test = "";

        System.out.println("Moi ban nhap vao " + numbers + " chu so.");

        for (int i = 0; i < numbers; i++) {
            System.out.println("So thu " + (i + 1) + " la: ");
            array[i] = sc.nextInt();
        }

        System.out.println("----------------------------\n\n");
        System.out.println("Danh sach cac so la: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(Integer.toString(array[i]));
        }

        int max= array[0];
        int viTri = 0;

        if (numbers == 1) {
            System.out.println("Gia tri lon nhat la: " + array[0] + " , tai vi tri thu nhat ");
        }else {
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                    viTri = i + 1;
                }
            }
            System.out.println("Gia tri lon nhat la: " + max + " , tai vi tri thu: " + viTri);
        }
    }
}
