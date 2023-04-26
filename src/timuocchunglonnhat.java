import java.util.Scanner;

public class timuocchunglonnhat {
    public static void main(String[] args) {
        //Ý tưởng :
        //b1: Khai báo hai biến số nguyên a, b và nhập giá trị cho a, b từ bàn phím
        //b2: Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        //b3:  Kiểm tra a, b có bằng 0 hay không
        //b4: Tìm ước số chung lớn nhất của a, b
        //b5: ket thuc vong lp va in ra kq
        //khai biao bien int a va b
        int a;
        int b;// khai bao doi tuong scanner va gan gia tri vao bien input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        //Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);
        // dung if Kiểm tra a, b có bằng 0 hay không
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        //Sử dụng vòng lặp kiểm tra trong khi a khác b thì
        //Nếu a < b: a = a – b
        //Còn lại b = b – a
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        // in ra kq
        System.out.println("Greatest common factor: " + a);
    }


}
