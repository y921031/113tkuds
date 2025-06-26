/*練習題七：二維陣列的基本操作
檔名：ds_07.java
請撰寫一個 Java 程式，創建一個 3x3 的二維陣列，並輸出其所有元素。 */

class ds_07 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("3x3 二維陣列內容：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
