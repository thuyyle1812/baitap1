import java.util.Scanner;

public class incacso {
    public static void main(String[] args) {
        // khai bao doi tuong scanner
        Scanner cs = new Scanner(System.in);
        // khai bao bien so
        int so ;
        //nhap gia tri tu bam phim va gan gia tri vua nhap vao 1 so
        System.out.println("nhap vao 1 so:");
        //nhap so va gan gia tri
        so = cs.nextInt();
        // dung dk if/ else lay so chia cho 4 va bang bang 0
        if (so % 4==0){
            //in ra kq
            System.out.println("la so chan:");
        }else {
            System.out.println("la so le:");
        }
    }
}
