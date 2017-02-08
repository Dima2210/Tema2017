package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

import java.util.Date;

/**
 * Задача в классе Main
 * Класс Сделка
 * Created by User on 31.01.2017.
 */
public class Deal {
    private Date dateDeal = new Date();
    private Party buyer;
    private Party seller;
    private Product[] product;

    public Deal(Party buyer, Party seller, Product[] product){
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
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

    public Product[] getProduct() {

        return product;
    }

    /**
     * Выводит итого сумма по заказаным товаром
     * @return
     */
    public long getSum() {
        long rez = 0;
        for (int index = 0; index < product.length; index++) {
            rez += product[index].getCost();
        }
        return rez;
    }


}

