package MyRepository.Tema2017.Tema2.YuriyTkach.Tema2;

/**
 * Поиск индекса элимента в отсортировать массив типа char методом золотого сечения
 * Created by User on 27.01.2017.
 */
public class Test2 {
    public static void main(String[] args){
        // создаем массив типа char
        char[] ar = {'A', 'B', 'C', 'D', 'E', 'F', 'S', 'W'};
        //Выводим его на экран
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " " );
            testChar(ar[i]);
        }
        int a = 65;
        if (a == ar[0]){
            System.out.print("УРААААААААААААА");
        }

        System.out.println();
        System.out.print( "+++ " + find(ar,ar[4]) + " -------");
        System.out.println("Финиш");
       // System.out.println(" Старт теста testArray");
        //  testArray(ar);
        // System.out.println(" Финиш теста");


    }

    /**
     * Метод для анализа массива золотым сичением
     * @param ar
     * @param
     * @return
     */

    public static int find (char[] ar, int keus) {
        int start = 0;
        int finich = ar.length;
        int dlina = finich - start;
        int seredina = dlina / 2;

        // тело цикла
        while (keus != ar[seredina]) {
            if (keus < ar[seredina]) {
                finich = seredina;
                dlina = finich - start;
                seredina = dlina / 2;
            } else if (keus > ar[seredina]) {
                start = seredina;
                dlina = finich - start;
                seredina = start + (dlina / 2);
            }
        }
        return seredina;
    }


    /**
     * переводим char в инт
     * @param ch
     * @return
     */
    public static int intThesChar (char ch){

        return ch;
    }

    /**
     * тест по приобразованию char в int
     * @param ch
     */
    public static void testChar(char ch){
        int c = ch;
        char x = (char) c;
        if(ch != x){
            System.out.print("ошибка с типом char--- ");
        }
    }

    /**
     * Метод для тестирования поиска элемента в отсортировоном массиве
     * @param ar
     */

    public static void testArray(char[] ar){
        for (int index = 0; index < ar.length; index++){
            int rez = find(ar, index);
            if (rez != ar[index]){
                System.out.println("У нас проблемы ");
            }else {
                System.out.println("все хорошо я сейчас здесь " + index );
            }

        }
    }

}
