/*練習題五：計算一維陣列總和
檔名：ds_05.java
請撰寫一個 Java 程式，創建一個包含 10 個整數的一維陣列，並計算所有元素的總和。 */

class ds_05{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        System.out.print("一維陣列所有元素總和:");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}