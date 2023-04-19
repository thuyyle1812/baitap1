import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        //khai bao doi tuong double
        double diemchuyencan;
        double diemkhiemtra;
        double diemcuoiki;
        // khai bao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        //gan gia tri diem chuyen can va nhap vao bam phim

        diemchuyencan = scanner.nextDouble();
        System.out.println("diem chuyen can");
        //gan gia tri diem ktra va nhap vao bam phim
        diemkhiemtra = scanner.nextDouble();
        System.out.println("diem khiemtra");
        //gan gia tri diem cuoiki va nhap vao bam phim
        diemcuoiki = scanner.nextDouble();
        System.out.println("diem cuoi ki");
        //tinh diem trung binh
        Double diemTrungBinh = (diemchuyencan + diemkhiemtra + diemcuoiki) / 3;
        System.out.println("diemtrung binh");

        if (diemTrungBinh >= 8.5) {
            //  neu diem tb >=8.5 thi chay khoi lenh ben duoi
            System.out.println("diem a");
        } else if (diemTrungBinh >= 7 && diemTrungBinh <= 8) {
            //  neu diem tb >=7 va <=8  thi chay khoi lenh ben duoi
            System.out.println("diem b");
        } else if (diemTrungBinh >= 5.5 && diemTrungBinh < 7) {
            //  neu diem tb >=5.5 va <7 thi chay khoi lenh ben duoi
            System.out.println("diem c");
        } else if (diemTrungBinh >= 4 && diemTrungBinh < 5.5) {
            //  neu diem tb >=4 va <5.5 thi chay khoi lenh ben duoi
            System.out.println("diem d");
        } else if (diemTrungBinh < 4) {
            //  neu diem tb <4 thi chay khoi lenh ben duoi

            System.out.println("diem F");
        } else {
            System.out.println();
        }
    }
}

