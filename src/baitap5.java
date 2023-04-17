import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        //khai bao bien double
        double num1;
        double num2;
        char pheptinh;
        double ketqua;
        //khai bao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        //nhap gia tri tu bam phim va gan gia tri vua nhap vao bien so
        System.out.println("nhap 1 so");
        num1 = scanner.nextDouble();
        //nhap gia tri tu bam phim va gan gia tri vua nhap vao bien so
        System.out.println("nhap vao so 2");
        num2 = scanner.nextDouble();
        // sử dụng công thức toán tử
        System.out.println("nhap phep tinh(+,-,*,/,%)");
        //nhap gia tri tu ban phim va lay kí tư đầu tiên va gan vao bien phep tinh
        pheptinh = scanner.next().charAt(0);
        //su dung switch case
        switch (pheptinh) {
            //su dung cong thuc toan tu cong
            case '+':
                ketqua = num1 + num2;
                break;
            //su dung cong thuc toan tu tru
            case '-':
                ketqua = num1 - num2;
                break;
            //su dung cong thuc toan tu nhan
            case '*':
                ketqua = num1 * num2;
                break;
            //su dung cong thuc toan tu chia
            case '/':
                ketqua = num1 /num2;
                break;
            //su dung cong thuc toan tu chia phan tram
            case '%':
                ketqua = num1 % num2;
                break;
            default:
                System.out.println("phep tinh tren khong hop le!");
                return;
        }
    }
}
