/*練習題三：輸入並輸出個人資訊
檔名：ds_03.java
請撰寫一個 Java 程式，讓使用者輸入姓名、年齡與城市，然後輸出這些
資訊。 */

import java.util.Scanner;

class ds_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入姓名、年齡、城市 ");
        String name = sc.next();
        int age = sc.nextInt();
        String city = sc.next();
        System.out.println("姓名:"+name+"\n年齡:"+age+"\n城市:"+city);
        sc.close();
    }
}