package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 * Задача см класс Main
 * Класс для ввода информации с клавиатуры
 * Created by User on 01.02.2017.
 */
public class Keyboard {
    /**
     * Для получения String информации c клавиатуры
     * @param message
     * @return
     */
    public static String keyboardString (String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        String rez = scanner.nextLine();
       // scanner.close();
        return rez;
    }

    /**
     * Для получения int информации c клавиатуры
     * @param message
     * @return
     */
    public static int keyboardInt (String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        int rez = scanner.nextInt();
        //scanner.close();
        return rez;
    }

    /**
     * Для получения long информации c клавиатуры
     * @param message
     * @return
     */
    public static long keyboardLong (String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        long rez = scanner.nextLong();
        //scanner.close();
        return rez;
     }

    /**
     * Для получения String[] информации c клавиатуры
     * @param message
     * @return
     */
    public static String[] keyboardStringArray (String message){
        String[] ars = new String[keyboardInt(message)];
        for (int index = 0; index < ars.length; index ++){
            ars[index] = keyboardString("Введите название дополнительного поля; ");
        }
        return ars;
    }



}
