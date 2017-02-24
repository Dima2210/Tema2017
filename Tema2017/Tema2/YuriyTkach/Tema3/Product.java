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
    //кол-во
    protected int quntiti;

    public String getTitle() {
        return title;
    }

    public long getPrice() {
        return price;
    }

    public int getQuntiti(){
        return quntiti;
    }

    /**
     * Задача 1
     * Выводит сумму по товару
     * Задача 2
     * Выводит сумму по товару с учетом скидки
     * @return
     */
    public long getCost () {
        // к задаче 1
        // return quntiti * price;
        // к задаче 2
        long realCost = quntiti * price;
        return realCost - realCost * calcDiscont()/100;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setQuntiti(int quntiti) {
        this.quntiti = quntiti;
    }

    /**
     *  Метод для установления скидки взовисемости от кол-ва продукта
     */
    protected int calcDiscont() {
        if (quntiti > QUNTITITI_DISCNT){
            return DEF_DISCNT;
        } else {
            return 0;
        }
    }


}
