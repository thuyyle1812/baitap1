public class btap5phuongthuc {
    public static void main(String[] args) {
        // kbao phuong thuc
                int[] arr = {5, 10, 2, 8, 9};
                //
                int max = getMaxValue(arr);
                System.out.println("Giá trị lớn nhất trong mảng là: " + max);
            }
            public static int getMaxValue(int[] arr) {
                int maxValue = arr[0];
                //dung for neu
                // int i bang 1
                // i be hon arr.length
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > maxValue) {
                        maxValue = arr[i];
                    }
                }
                return maxValue;
            }
        }


