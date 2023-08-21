import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
int j = 0;
for (int i = 1582; i <= 2023; i ++) {
    if (isLeapYear(i)) {
        j++;
        // здесь нужно вывести результат
        System.out.println(j + " - " + i);

    }
}
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) result = true;
        return result;
    }
} 