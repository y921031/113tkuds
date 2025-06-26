/*練習題二：計算圓的面積
檔名：ds_02.java
請撰寫一個 Java 程式，讓使用者輸入圓的半徑並計算其面積。*/
import java.util.Scanner;

class ds_02{
    public static void main(String[] args) {
        System.out.print("輸入圓的半徑:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("圓的面積"+r*r*3.14);
        sc.close();
    }
}