/*練習題一：計算兩數之和
檔名：ds_01.java
請撰寫一個 Java 程式，讓使用者輸入兩個整數並計算它們的和。*/

import java.util.Scanner;

class ds_01{
    public static void main(String[] args) {
        System.out.print("輸入兩個整數:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("兩個整數和:"+(a+b));
        sc.close();
    }
}