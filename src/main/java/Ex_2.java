// 2: Обработка некорректного ввода
// Напишите программу, которая запрашивает у пользователя его возраст.
// Если введенное значение не является числом, выбросите исключение
// NumberFormatException с сообщением "Некорректный ввод". Иначе выведите возраст на экран.

import java.io.*;

public class Ex_2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите свой возраст:");
        String age = bufferedReader.readLine();

        try {
            int nAge = Integer.parseInt(age);
            System.out.println("Возраст: " + nAge);
        } catch (NumberFormatException ex) {
            System.out.println("Некорректный ввод!");
        }
    }
}
