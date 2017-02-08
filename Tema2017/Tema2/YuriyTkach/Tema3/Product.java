package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

/**
 * Задача в классе Main
 * Класс Product (продукт товар)
 * Created by User on 31.01.2017.
 */
public class Product {
    private String title;
    private long price;
    private int quntiti;

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
     * Выводит сумму по товару
     * @return
     */
    public long getCost () {
        return quntiti * price;
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


}
