import java.util.Scanner;

public class hienthikitutrongchuoi {
    public static void main(String[] args) {
        //y tuong :
        //b1:Khai báo chuoi
        //b2:Sử dụng vòng lặp duyệt từng ký tự trong chuỗi.
        //b3:in ra kq
        // kbao chuoi
        String chuoi = "chuoi";
        System.out.println("cac ki tu co trong chuoi:");
        // dung vong lap for neu
        // int i bang 0; i be hon chuoi.leng, i ++
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.println(chuoi.charAt(i));
        }
    }
}