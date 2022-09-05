//  Домашнее залание к Уроку 5 «Циклы» (Части 1-й).
public class Main {
    public static void main(String[] args) {
        System.out.println();
//  ДЗ 5.1.1
        {
            for (byte i = 1; i <= 10; i ++) System.out.printf("%d ", i);
            System.out.println();
        }

//  ДЗ 5.1.2
        {
            for (byte i = 10; i >= 1; i --) System.out.printf("%d ", i);
            System.out.println();
        }

//  ДЗ 5.1.3
        {
            for (byte i = 2; i <= 17; i ++) if ((i % 2) == 0) System.out.printf("%d ", i);
            System.out.println();
        }
    }
}