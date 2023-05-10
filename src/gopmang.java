import java.util.Arrays;

public class gopmang {
    public static void main(String[] args) {
        // kbao mang int
        int[] arr1 = {4, 5, 6};
        int[] arr2 = {7, 8, 9};
        int[] arr3 = new int[arr1.length + arr2.length];
        //dung vong lap for neu
        // int i bang 0
        // j bang 0
        for (int i = 0, j = 0; i < arr3.length; i++) {
            if(i< arr1.length){
                arr3[i]= arr1[i];
                // dung lai
                continue;
            }
            arr3 [i]=arr2[j];
            j++;
        }
// in ra kq
        System.out.println(Arrays.toString(arr3));

    }
}
