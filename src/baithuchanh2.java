import java.util.Scanner;

public class baithuchanh2 {
    public static void main(String[] args) {
        //khai bao doi tuong scanner
        Scanner sc = new Scanner(System.in);
        //khai bao bien so
        int so;
        //nhap gia tri tu bam phim va gan gia tri vua nhap vao bien so
        System.out.println("nhap vao 1 so:");
        //nhap so va gan gia tri
        so = sc.nextInt();
        if(so%2==0) {
            //neu so chia het cho 2 bang bang 0 thi chay theo khoi lenh ben duoi
            System.out.println("là số chẵn:");
        }else{
            //neu khong khong thoa man dieu kien tren thi chay theo khoi lenh ben duoi
            System.out.println("là số lẻ:");
        }
    }
}
