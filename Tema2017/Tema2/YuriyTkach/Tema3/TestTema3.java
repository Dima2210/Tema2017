package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

import java.util.Random;

/**
 * Задача протестировать классы
 * Created by User on 04.02.2017.
 */
public class TestTema3 {

    // надо создать четыре массива для рандома 1 массивв цен, 2 массив кол-ва. 3 массив наименования товаров 4 массив Контраагенов
    // использовать рандом

     // продуктов
    private String[] title = {" картошка ", " банан ", " огурец ", " хлеб ", " молоко ", " арбуз"};
    //кол-ва
    private int[] quntiti = {10, 1, 5, 8, 6, 29};
    //  цен
    private long[] price = {200, 589, 84655, 48545241, 874541, 78545};
    // контрагентов
    private String[] name = {" Гум ", " Цум ", " Ун. Беларусь ", " Неман ", " Кристал ", " Кирмаш "};

    /**
     * метод для рандома
     * @return
     */
    public static int random () {
        Random random = new Random();
        return random.nextInt(6);
    }

    /**
     * Тестируем обьект рандом
     */
    public void testProduct(){
        System.out.println(" Запуск testProduct");
        Product product = new Product();
        inputTestProduct(product);
        outputTestProduct(product);
        System.out.println("==========testProduct()========= Пройден ===");
    }

    /**
     *  Тестируем объект Product
     *  метод по заполнению полей
     *  @param product
     */
    public Product inputTestProduct(Product product){
        System.out.println(" Запуск inputTestProduct");
        product.setTitle(title[random()]);
        product.setQuntiti(quntiti[random()]);
        product.setPrice(price[random()]);
        System.out.println(" ======== inputTestProduct()====== Пройден =======");
        return product;
    }

    /**
     * Ввывод на экран содиржимого объекта Product
     * @param product
     */
    public void outputTestProduct(Product product) {
        System.out.println(" Запуск outputTestProduct ");
        System.out.println(" Выводим product.getTitle() наименование " + product.getTitle());
        System.out.println(" Выводим product.getQuntiti() кол-во " + product.getQuntiti());
        System.out.println(" Выводим product.getPrice() ценна за ед. " + product.getPrice());
        System.out.println(" Выводим product.getCost() сумма " + product.getCost());
        System.out.println("==========outputTestProduct()========= Пройден ===");
    }

    /**
     * Создаем  объект Deal (сделка) для тестирования
     */
    public Deal inputTestDeal(){
        //  поле private Date dateDeal = new Date();
        //  поле private Party buyer;
        //  поле private Party seller;
        //  поле private Product[] product;

        // создали три продукта
        Product [] products = new Product[3];
        for (int index = 0; index < products.length; index++){
            Product product = new Product();
            products[index] = inputTestProduct(product);
        }

        // создаем покупателя и продовца
        Party buyer = new Party();
        buyer.setName(name[random()]);

        Party seller = new Party();
        seller.setName(name[random()]);
        Deal deal = new Deal(buyer,seller,products);
        return deal;
    }

    /**
     * Выводим сделку на экран
     *
     */
    public void outputTestDeal (Deal deal){
        //  поле private Date dateDeal = new Date();
        //  поле private Party buyer;
        //  поле private Party seller;
        //  поле private Product[] product;

        System.out.println( "Дата сделки " + deal.getDateDeal());
        System.out.println("Покупатель " + deal.getBuyer().getName());
        System.out.println("Продавец" + deal.getBuyer().getName());

        for (int index = 0; index < deal.getProduct().length; index++){
           outputTestProduct(deal.getProduct()[index]);

        }
    }


}
