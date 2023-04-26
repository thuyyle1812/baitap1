import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        // y tuong :
        // b1: khai bao bien scanner va int
        //b2:dung boolean va bien check de trả về false hoặc true
        //b3:nhap number va gán vào giá trị
        //b4:dùng vòng lặp for và gán giá trị cho bien co kieu du lieu int
        //b5:in ra kq
        //khai bao bien scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so:");
        // khai bao biến so int
        int number;
        // dung boolean va bien check de trả về false hoặc true
        boolean check = false;
        //nhap number va gán vào giá trị
        number = sc.nextInt();
        // dùng vòng lặp for và gán giá trị cho bien co kieu du lieu la
        //int i=2
        //i bé hơn hoặc bằng number trừ 1
        // i ++
        for (int i = 2; i <= number - 1; i++) {
            //dùng if lấy number % i ==0 thì chạy khối lệnh bên dưới
            if (number % i == 0) {
                check = true;
            }
        }
        // in ra  kq
        if (check) {
            System.out.println(number + "khong phai la so nguyen to");
        } else {
            System.out.println(number + " la so nguyen to");
        }
    }
}
