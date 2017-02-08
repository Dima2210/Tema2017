package MyRepository.Tema2017.Tema2.YuriyTkach.Tema2;
/**
 * Задача:
 * Отсортировать массив через нахождения минемального числа
 * Created by User on 26.01.2017.
 */
public class Test1 {
    public static void main(String[] args) {
        int[] ar = {5, 1, 6, 9, -10, -14, 5};
        System.out.println("Первоночальный массив");
        for (int index = 0; index < ar.length; index++) {
            System.out.print(ar[index] + " ");
        }
        System.out.println();
        minNumberArray2(ar);
        int d = minNumberArray(ar);
        System.out.println( "+++ " + d);
        // массив после изминений
        for (int index = 0; index < ar.length; index++) {
            System.out.print(ar[index] + " ");
        }
    }

    /**
     * метод для нахождения минемального числа в массиве
     *
     * @param args
     */
    public static int minNumberArray(int[] args) {
        int min = args[0];
        int indexMinNumber = 0;
        for (int index = 1; index < args.length; index++) {
            if (min >= args[index]) {
                min = args[index];
                indexMinNumber = index;
            }
        }
        System.out.print("Минимальное число " + min);
        return indexMinNumber;
    }

    /**
     *
     * @param args массив типа int
     * @param i123 стартовая точка для начало проверки массива
     * @return
     */
    public static int minNumberArray(int[] args, int i123) {
        int min = args[i123];
        int indexMinNumber = 0;
        for (int index = i123; index < args.length; index++) {
            if (min >= args[index]) {
                min = args[index];
                indexMinNumber = index;
            }
        }
        return indexMinNumber;
    }

    /**
     * метод по сортировки массива не пузерьком а двумя циклами
     * @param args
     */
    public static void minNumberArray2(int[] args) {
        int min = -1;
        int indexMinNumber = -1;

        for (int i1 = 0; i1 < args.length; i1++){

            indexMinNumber = minNumberArray(args,i1);
            if (indexMinNumber != 0){
                 min = args[i1];
                 args[i1] = args[indexMinNumber];
                 args[indexMinNumber] = min;
            }
        }
    }
}