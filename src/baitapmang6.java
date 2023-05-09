public class baitapmang6 {
    public static void main(String[] args) {
        // kbao mang
        int[] arr = {5, 6, 7, 8, 9,};
        int max = arr[0];
        // dung vong lap for neu
        //int i bang 1
        //i be hon arr.length
        //i ++
        for (int i = 1; i < arr.length; i++) {
             //dung if so sanh gia tri array voi bien max
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("gia tri lon nhat trong mang la:" + max);
    }
}



