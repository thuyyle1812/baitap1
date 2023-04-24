import java.util.Scanner;

public class incacso2 {
    public static void main(String[] args) {
        // khai bao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        // khai bao bien n
        int n;
        //nhap gia tri tu bam phim va gan gia tri vua nhap vao 1 so n
        System.out.println("nhap vao 1 so n:");
        //nhap gia tri bien tu ban phim va gan gia tri cho bien n
        n = scanner.nextInt();
        System.out.println("cac so tu 1 den  "+n+" là: ");
        // dung vong lap for va gan gia tri cho bien co kieu du lieu la int i =1; i be hon hoặc bằng n ; i++
        for(int i=1; i<= n ; i++) {
            // in ra kq
            System.out.println(i +"");
        }
    }
}
