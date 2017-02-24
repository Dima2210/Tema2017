package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

import java.util.Random;

/**
 * Задача 3 протестировать классы
 * Задача 4 протестировать класс с внесеными изминениями
 * Created by User on 04.02.2017.
 */
public class TestTema3 {
     // продуктов к задаче 3
   // private String[] title = {" картошка ", " банан ", " огурец ", " хлеб ", " молоко ", " арбуз"};
    //Задание 4 массив адресов
    private String[] addres = {"ул.Правды 8", "ул.Немига 9", "ул.Ленина 12", "ул.Гагарино 158", "ул.Смоленская 58", "ул.Удачи 1"};
    //Задание 4 массив продуктов
    private String[] title = {"Фотоапорат", "Ботинки","Фотоапорат", "Ботинки","Фотоапорат", "Ботинки"};
    //кол-ва
    private int[] quntiti = {10, 1, 5, 8, 6, 29};
    //  цен
    private long[] price = {200, 589, 84655, 48545241, 874541, 78545};
    // контрагентов
    private String[] name = {" Гум ", " Цум ", " Ун. Беларусь ", " Неман ", " Кристал ", " Кирмаш "};
    // к Задаче 4 Кол-во доп. полей (keys, values)
    private int quntitiKeysValues = 2;
    //К задаче 4 размер обуви
    private int[] size = {36, 37, 38, 39, 40, 41};
    //К задаче 4 цвет обуви
    private String[] color = {"белый", "черный", "рыжый", "молочный", "синий", "красный"};
    //К задаче 4 кол-во мегапиксель в фотоапорате
    private double[] megapx = {1.5, 5.8, 2.3, 4.8, 4.2, 9.5};
    // К задаче 4 цифровой или нет фотоапорат
    private boolean[] digetal = {true, true, false, true, false, false};

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
       // Задача 3
       // Product product = new Product();
        // задача 4
        Product product = null;
        inputTestProduct(product);
        outputTestProduct(product);
        System.out.println("==========testProduct()========= Пройден ===");
    }

    public Product inputRandomProduct(){
       System.out.println("Запуск inputRandomProduct()");
        BotinkiProduct botinkiProduct = new BotinkiProduct();
        FotoProduct fotoProduct = new FotoProduct();
        Product[] randomProduct = {botinkiProduct, fotoProduct};
        Random random1 = new Random();
        System.out.println("===inputRandomProduct()====Пройден====");
        return randomProduct[random1.nextInt(2)];
    }
    /**
     *  Тестируем объект Product
     *  метод по заполнению полей
     *  @param product
     */
    public Product inputTestProduct(Product product){
        System.out.println(" Запуск inputTestProduct");
        //К задаче 4

        if(product instanceof BotinkiProduct){
            BotinkiProduct botinkiProduct = (BotinkiProduct)product;
            botinkiProduct.setColor(color[random()]);
            botinkiProduct.setSize(size[random()]);

            product = botinkiProduct;
        } else if(product instanceof FotoProduct) {
            FotoProduct fotoProduct = (FotoProduct)product;
            fotoProduct.setMegapx(megapx[random()]);
            fotoProduct.setDigetal(digetal[random()]);

            product = fotoProduct;
        } else {
            System.err.print("Ошибка прохождени метода inputTestProduct появился новый продукт");
            System.exit(-1);
        }
        // Задача 3
        product.setTitle(title[random()]);
        product.setQuntiti(quntiti[random()]);
        product.setPrice(price[random()]);
        System.out.println(" ======== inputTestProduct()====== Пройден =======");
        return product;
    }

    /**
     * Ввывод на экран содиржимого объекта Product к Задачам 3
     * Задача 4
     * @param product
     */
    public void outputTestProduct(Product product) {
        System.out.println(" Запуск outputTestProduct ");
        //Задача 4
        if (product instanceof BotinkiProduct){
            BotinkiProduct botinkiProduct = (BotinkiProduct) product;
            System.out.println("Цвет обуви" + botinkiProduct.getColor());
            System.out.println("Размер обуви" + botinkiProduct.getSize());
        }else if(product instanceof FotoProduct){
            FotoProduct fotoProduct = (FotoProduct) product;
            System.out.println("Фотоапорат цифровой" + fotoProduct.isDigetal());
            System.out.println("Кол-во мегапиксел" + fotoProduct.getMegapx());
        } else {
            System.err.println("Метод outputTestProduct(Product product) проверь наименование продукта");
            System.exit(-1);
        }

        //Задача 3
        System.out.println(" Выводим product.getTitle() наименование " + product.getTitle());
        System.out.println(" Выводим product.getQuntiti() кол-во " + product.getQuntiti());
        System.out.println(" Выводим product.getPrice() ценна за ед. " + product.getPrice());
        System.out.println(" Выводим product.getCost() сумма " + product.getCost());
        System.out.println("==========outputTestProduct()========= Пройден ===");
    }

    /**
     * Для решения задачи 4
     * @return
     */
    public Party inputTestParti (){
        System.out.println("Запуск inputTestParti");
        Party party = new Party();
        party.setName(name[random()]);
        party.setAddress(addres[random()]);
        String[] keys = new String[quntitiKeysValues];
        String[] values = new String[quntitiKeysValues];
        for (int index = 0; index < keys.length; index ++){
            keys[index] = color[random()];
            values[index] = name[random()];
        }
        party.setKeys(keys);
        party.setValues(values);
        System.out.println("======== inputTestParti()=====Пройден========");
        return party;
    }

    /**
     * Задача 4 используем объект Program
     * @param party
     */
    public void outputTestParti(Party party){
        System.out.println("Запуск outputTestParti(Party party) ");
        Program programParty = new Program();
        programParty.outputParty(party);
        System.out.println("========= outputTestParti(Party party)========= Пройден");
    }

    /**
     * Создаем  объект Deal (сделка) для тестирования
     */
    public Deal inputTestDeal(){
        System.out.println("Запуск inputTestDeal()");
        //  поле private Date dateDeal = new Date();
        //  поле private Party buyer;
        //  поле private Party seller;
        //  поле private Product[] product;
        // Задача 3 создали три продукта
        Product [] products = new Product[3];
        for (int index = 0; index < products.length; index++){
            // Задача 3
            //Product product = new Product();
            //ЗАДАЧА 4
            Product product = null;
            products[index] = inputTestProduct(inputRandomProduct());
        }
        // Задача 3 создаем покупателя
        /**
        Party buyer = new Party();
        buyer.setName(name[random()]);
        */
        //Задача 4
        Party buyer = inputTestParti();
        // Задача 3 создаем продовца
        /**
        Party seller = new Party();
        seller.setName(name[random()]);
         */
        //Задача 4 заполнение доп полей
       Party seller = inputTestParti();

        Deal deal = new Deal(buyer,seller,products);
        System.out.println("========= inputTestDeal()========Пройден====");
        return deal;
    }

    /**
     * Выводим сделку на экран
     *
     */
    public void outputTestDeal (Deal deal){
        System.out.println("Запуск outputTestDeal (Deal deal)");
        //  поле private Date dateDeal = new Date();
        //  поле private Party buyer;
        //  поле private Party seller;
        //  поле private Product[] product;
        // Задача 3
        /**
        System.out.println( "Дата сделки " + deal.getDateDeal());
        System.out.println("Покупатель " + deal.getBuyer().getName());
        System.out.println("Продавец" + deal.getSeller().getName());

        for (int index = 0; index < deal.getProduct().length; index++){
           outputTestProduct(deal.getProduct()[index]);

        }
         */
        //Задача 4
        System.out.println("Дата сделки" + deal.getDateDeal());
        outputTestParti(deal.getBuyer());
        outputTestParti(deal.getSeller());

        for (int index = 0; index < deal.getProduct().length; index++){
            outputTestProduct(deal.getProduct()[index]);
        }
        System.out.println("========outputTestDeal (Deal deal)============ Пройден=======");
    }
}
