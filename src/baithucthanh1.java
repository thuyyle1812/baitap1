import java.util.Scanner;

public class baithucthanh1 {
    public static void main(String[] args) {
        //Khai bao doi tuong scanner
        Scanner sc = new Scanner(System.in);
        //Khai bao 2 bien cân nang và chieu cao
        float cannang, chieucao;
        System.out.println(" nhap weight:");
        //nhap can nang va gán gia tri vua nhap cho bien can nang
        cannang = sc.nextFloat();
        System.out.println("nhap height:");
        //nhap chieu cao va gán gia tri vua nhap cho bien chieu cao
        chieucao = sc.nextFloat();
        float bmi = chieucao / (cannang * chieucao);
        if (bmi < 18.5) {
            //neu chi so bmi be hon 18.5 thi chay khoi lenh ben duoi
            System.out.println("Normal");

        } else if (bmi >= 25.0 && bmi < 30.0) {
            //neu chi so bmi lon hon hoac bang 18.0 hoac bmi be hon 30.0 thi chay khoi lenh ben duoi

            System.out.println("Overweight:");

        } else if (bmi >= 18.0 && bmi < 25.0) {
            //neu chi so bmi lon hon hoac bang 18.0 hoac bmi be hon 25.0thi chay khoi lenh ben duoi
            System.out.println("Overweight");
        } else {
            //neu khong khong thoa man dieu kien tren thi chay theo khoi lenh ben duoi
            System.out.println("Obese");
        }
    }
}
