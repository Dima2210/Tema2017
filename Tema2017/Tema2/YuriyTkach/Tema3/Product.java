package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

/**
 * Задача в классе Main
 * Класс Product (продукт товар)
 * Created by User on 31.01.2017.
 */
public abstract class Product {
    //размер скидки
    protected static final int DEF_DISCNT = 10;
    // кол-во необходимое для получения скидки
    protected static final int QUNTITITI_DISCNT = 10;
    // наименование
    protected String title;
    //цена
    protected long price;
    //кол-во до задаче 5
    //protected int quntiti;

    public String getTitle() {
        return title;
    }

    public long getPrice() {
        return price;
    }

    // до 5 задаче
    /*
    public int getQuntiti(){
        return quntiti;
    }
    */


    // до 5 задачи
        /*
     * Задача 1
     * Выводит сумму по товару
     * Задача 2
     * Выводит сумму по товару с учетом скидки
     * @return
     */
    /*
    public long getCost () {
        // к задаче 1
        // return quntiti * price;
        // к задаче 2
        long realCost = quntiti * price;
        return realCost - realCost * calcDiscont()/100;
    }
    */
    //задача 5
    /**
     * Задача 1
     * Выводит сумму по товару
     * Задача 2
     * Выводит сумму по товару с учетом скидки
     * @return
     */
    public long getCost (int quntiti) {
        // к задаче 1
        // return quntiti * price;
        // к задаче 2
        long realCost = quntiti * price;
        return realCost - realCost * calcDiscont(quntiti)/100;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    //до 5 задаче
    /*
    public void setQuntiti(int quntiti) {
        this.quntiti = quntiti;
    }
    */

    // до 5 задаче
    /*
     *  Метод для установления скидки взовисемости от кол-ва продукта
     */
    /*
    protected int calcDiscont() {
        if (quntiti > QUNTITITI_DISCNT){
            return DEF_DISCNT;
        } else {
            return 0;
        }
    }
    */
    //задача 5
    /**
     * Метод для установления скидки взовисемости от кол-ва продукта
     * @param quntiti (кол-во)
     * @return
     */
    protected int calcDiscont(int quntiti) {
        if (quntiti > QUNTITITI_DISCNT){
            return DEF_DISCNT;
        } else {
            return 0;
        }
    }


}
