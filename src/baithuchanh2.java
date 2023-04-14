import java.util.Scanner;

public class baithuchanh2 {
    public static void main(String[] args) {
        //khai bao doi tuong scanner
        Scanner sc = new Scanner(System.in);
        //khai bao bien so
        int so;
        //nhap gia tri tu bam phim va gan gia tri vua nhap vao 1 so
        System.out.println("nhap vao 1 so:");
        //
        so = sc.nextInt();
        //cau dk
        if(so%4==0) {
            System.out.println("là số chẵn:");
        }else{
            System.out.println("là số lẻ:");
        }
    }
}
