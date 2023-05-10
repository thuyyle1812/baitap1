import java.util.Scanner;

public class themphantumang {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 2, 9};
        //  khai bao doi tuong scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can them:");
        //nhap number va gán gia tri vua nhap cho bien
        int number = sc.nextInt();
        System.out.println("nhap vao vi tri can chen");
        //nhap index va gán gia tri vua nhap cho bien
        int index = sc.nextInt();
        int[] new_arr = new int[arr.length + 1];
        // dung vong lap for neu
        //int i bang 0
        // j bang 0
        //i be hon new_arr.length
        // i ++
        for (int i = 0, j = 0; i < new_arr.length; i++) {
            if (i == index) {

                new_arr[i] = number;
                // dung lai
                continue;
            }
            new_arr[i] = arr[j];
            j++;
        }
        // dung vong lap for neu
        //int t bang 0

        //t be hon new_arr.length
        // t ++

        for (int t = 0; t < new_arr.length; t++) {

            System.out.println(new_arr[t]);

        }
    }
}