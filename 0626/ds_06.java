/*練習題六：找出一維陣列中的最大值
檔名：ds_06.java
請撰寫一個 Java 程式，創建一個包含 10 個隨機整數的一維陣列，並找出其中的最大值。 */

import java.util.Random;

class ds_06{
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[10];

        System.out.print("陣列內容：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("\nmax: "+max);
    }
}