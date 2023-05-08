import java.util.Scanner;

public class baitap3mang {
    public static void main(String[] args) {
        //kbao bien int
        int[] number = new int[5];
        //kbao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        // sdung vong lạp for neu int i bang 0
        //i be hon number.length
        // i ++
        for (int i = 0; i < number.length; i++) {
            System.out.println("nhap phan tu " + i);
            //kbao bien number
            number[i] = scanner.nextInt();
        }
        System.out.println("thong tin cua mang");
        // dung for neu int i bang 0
        // i < number.length
        // i ++
        for (int i = 0; i < number.length; i++) {
            System.out.println("phan tu" + i + +number[i]);
        }
    }
}
