public class btapthuchanh2phuongthuc {
    public static void main(String[] args) {
        //kbao int
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        //
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int[] array) {
        int index = 0;
        // dung vong lap for neu
        // int i bang 1
        // i be hon array.length
        // i++
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
    }

