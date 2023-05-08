public class khoitao {
    public static void main(String[] args) {
        // khởi tạo mảng
        int[] number= {1, 2, 3, 4, 5};
        // khởi tạo mảng bằng for
        for (int i = 0; i < number.length; i++) {
            // kbao bien so de tang 1 gia tri
          number [i] = i+1;
            System.out.println(number[i]);

        }
    }
}
