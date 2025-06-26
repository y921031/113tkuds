/*練習題四：一維陣列的基本操作
檔名：ds_04.java
請撰寫一個 Java 程式，創建一個包含 5 個整數的一維陣列，並輸出所有元素。 */

class ds_04{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.print("一維陣列所有元素:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}