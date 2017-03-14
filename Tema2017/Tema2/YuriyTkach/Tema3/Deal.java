package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача в классе Main
 * Класс Сделка
 * Created by User on 31.01.2017.
 */
public class Deal {
    private Date dateDeal = new Date();
    private Party buyer;
    private Party seller;
    // До 5 задаче
    /*
    private Product[] product;
    */
    //задача 5
    /**
     * private final Map<Product,Integer> product Хронит продукт каторый преобрели и кол-во (quntiti);
     */
    private final Map<Product,Integer> product = new HashMap<Product, Integer>();

    //до 5 задачи
    /*
    public Deal(Party buyer, Party seller, Product[] product){
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
    }
    */
    public Deal(Party buyer, Party seller){
        this.buyer = buyer;
        this.seller = seller;

    }

    public Date getDateDeal() {
        return dateDeal;
    }

    public Party getBuyer() {
        return buyer;
    }

    public Party getSeller() {
        return seller;
    }

    public Map<Product,Integer> getProduct() {

        return product;
    }

    /**
     * Выводит итого сумма по заказаным товаром
     * @return
     */
    public long getSum() {
        //до 5 задачи
        /*
        long rez = 0;
        for (int index = 0; index < product.length; index++) {
            rez += product[index].getCost();
        }
        return rez;
        */
        long rez = 0;
        for (Map.Entry<Product,Integer> pr:product.entrySet()){
            Product product = pr.getKey();
            int quntiti = pr.getValue();
            rez += product.getCost(quntiti);
        }

        return rez;
    }


}

