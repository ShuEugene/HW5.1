//  Домашнее залание к Уроку 5 «Циклы» (Части 1-й).
public class Main {
    public static void main(String[] args) {
        System.out.println();
//  ДЗ 5.1.1
        {
            for (byte i = 1; i <= 10; i++) System.out.printf("%d ", i);
            System.out.println();
        }

//  ДЗ 5.1.2
        {
            for (byte i = 10; i >= 1; i--) System.out.printf("%d ", i);
            System.out.println();
        }

//  ДЗ 5.1.3
        {
            for (byte i = 2; i <= 17; i++) if ((i % 2) == 0) System.out.printf("%d ", i);
            System.out.println();
        }

//  ДЗ 5.1.4
        {
            for (byte i = 10; i >= -10; i--) System.out.printf("%d ", i);
            System.out.println();
        }

//  ДЗ 5.1.5
        {
            int startYear = 1904, endYear = 2096, i;
            System.out.printf("Високосные годы: ");
            for (i = startYear; i < ((((endYear / 4) - (endYear % 4)) * 4) - 4); i++)
                if (((i % 4) == 0 && (i % 100) != 0) || (i % 400) == 0)
                    System.out.printf("%d, ", i);
            System.out.println((i + 4) + ".");
        }

//  ДЗ 5.1.6
        {
            for (byte i = 7; i <=98; i += 7) System.out.printf("%d ", i);
        }

        System.out.println();
    }
}