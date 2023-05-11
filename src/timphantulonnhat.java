import java.util.Scanner;

public class timphantulonnhat {
    public static void main(String[] args) {
          int m ,n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so dong cua phan tu");
        m = scanner.nextInt();
        System.out.println("nhap so cot ca phan tu");
        n = scanner.nextInt();
        // khai báo ma trận A có m dòng, n cột
        int A[][] = new int[m][n];

        System.out.println("Nhập các phần tử : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        // tìm phần tử có giá trị lớn nhất
        int max = A[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }

    }
}
