import java.util.Scanner;

public class btap4phuongthuc {
    public static void main(String[] args) {
        //ytuong:
        //b1:kbao mang va kbao doi tuong scanner
        //b2:Nhập các giá trị cho mảng
        //b3: in ra kq
        // Kbao và khởi tạo mảng
        int[] arr = new int[5];
        //  kbao đối tượng scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        // dung for neu
        // int i bang 0
        // i be hon arr.length
        // i ++
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập giá trị cho phần tử " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        // in ra cac phan tu trong mang
        System.out.println("Các phần tử trong mảng là:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

