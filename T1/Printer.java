/* Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
    Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
    Метод divisionByZero - Деление на 0
    Метод numberFormatException - Ошибка преобразования строки в число */

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int [] ints = new int[10];
        int a = ints[100];
        System.out.println(a);
}

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 10;
        int b = 2;
        int c = a/b;
        System.out.println(c);
}

    public static void numberFormatException() {
        // Напишите свое решение ниже
       String a = "123rth";
       int b = Integer.parseInt(a);
       System.out.println(b);
 }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}