package View;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    // print(f'{title} = {data}')
    public void print(Double result, String title) {
        // System.out.printf("%s %d\n", title, result);
        System.out.println(result);

    }

    // // /**
    // // * Метод выбора операции
    // // * @return - номер операции
    // // */
    public int getChoice() {
        System.out.println("Choice operation:");
        System.out.println("\t1. Сумма");
        System.out.println("\t2. Умножение");
        System.out.println("\t3. Деление");
        return in.nextInt();
    }

}
