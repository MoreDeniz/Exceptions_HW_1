// 1: Проверка деления на ноль
// Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление.
// Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением
// "Деление на ноль недопустимо". Иначе выведите результат деления на экран.

import java.io.*;

public class Ex_1 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите целое число a:");
        String sa = bufferedReader.readLine();
        System.out.println("Введите целое число b:");
        String sb = bufferedReader.readLine();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        try {
            System.out.println(a + " / " + b + " = " + a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль недопустимо!");
        }
    }
}
