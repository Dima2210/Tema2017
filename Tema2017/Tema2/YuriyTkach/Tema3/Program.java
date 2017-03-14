package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

import sun.invoke.empty.Empty;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Условие задачи смотри клас Main
 * Класс для создание сделки и выввода её на экран
 * Created by User on 01.02.2017.
 */
public class Program {
    // регулируем кол-во сделок
    // до 5 задния
    /*
    private static final int DEAL = 1;
    //регулируем кол-во продуктов
    private static final int PRODUCT = 2;
    // Как тут дела где массив используется????? (создается )
    private int tail = 0;
    private Deal[] deal = new Deal[DEAL];
    */
    //5 задача
    private final Collection<Deal> deal = new LinkedList<Deal>();
    //????
    private final List<Product> products = new LinkedList<Product>();



    /**
     * Метод для заполнения массива сделки     *
     */
    public  void input () {
        // до 5 задания
        /*
        for (int index = 0; index < deal.length; index++){
            this.deal[index] = inputDeal();
        }

        if (tail < 10) {
            this.deal[tail] = inputDeal();
            tail++;
        } else {
            System.out.println("Сделку ввести не возможна память исчерпана");
        }
        */
        boolean continueInputDeal = true;
        do {
            deal.add(inputDeal());
            continueInputDeal = continueInputQuestion(" Вы планируете ещё создавать сделки");
        } while (continueInputDeal);


    }

    /**
     * Метод по созданию сделки
     * @return
     */
    public Deal inputDeal (){
        // Имя покупателя вводится с клавиатуры
        Party buyer= inputParty("Введите покупателя: ");
        // Имя продавца вводится с клавиатуры
        Party seller = inputParty("Введите продовца: ");
        //до 5 задания
        /*
        // Создаем три товара
        System.out.println("Введите три товара сделки:");
        Product [] products = new Product[PRODUCT];
        for (int index = 0; index < products.length; index++){
            products[index] = inputProduct();
        }
        // Создаем сделку
        return new Deal(buyer, seller, products);
        */
        //задача 5
        Deal deal = new Deal(buyer, seller);
        boolean continueInput = true;
        do {
            deal.getProduct().put(inputProduct(),Keyboard.keyboardInt(" Введите кол-во продуктов "));

            continueInput = continueInputQuestion(" Вы Планируете дольнейший ввод ");
        }while (continueInput);
        return deal;
    }
    /**
     * Вывод массива сделок на экран
     */
    public void outputProgramDeal() {
        //до 5 задаче
        /*
        for(int index = 0; index < deal.length; index++) {
            if (null != deal[index]) {
                System.out.println("Сделка от " + deal[index].getDateDeal());
                System.out.println("Покупатель: " + deal[index].getBuyer().getName());
                System.out.println("Продавец: " + deal[index].getSeller().getName());
                System.out.println("Сумма сделки: " + deal[index].getSum());
                //Вызов метода так как в одной сделки несколько товаров
                outputProduct(deal[index].getProduct());
            }
        }
        */
        // 5 задача
        System.out.println("я в методе outputProgramDeal()===========");
        for (Deal deals: deal){
            System.out.println(" Дата сделки " + deals.getDateDeal());
            System.out.println("Сделка от " + deals.getDateDeal());
            System.out.println("Покупатель: " + deals.getBuyer().getName());
            System.out.println("Продавец: " + deals.getSeller().getName());
            System.out.println("Сумма сделки: " + deals.getSum());

            for (Map.Entry<Product, Integer> entry: deals.getProduct().entrySet()){
                System.out.print(" Наименование продукта "+ entry.getKey().getTitle());
                System.out.println(" Кол-во " + entry.getValue());
            }
        }
        System.out.println("я выхожу из метода outputProgramDeal()===========");


    }

    /**
     * узнаем у аператора ввод будет продолжаться или нет
     * @param message
     * @return
     */
    public boolean continueInputQuestion(String message){
        String rez = Keyboard.keyboardString(message + " (да или нет) ");
        if(rez.compareToIgnoreCase("да")== 0){
            return true;
        } else {
            return false;
        }

    }

    /**
     * Создаем объект Party через ввод с клавиатуры Задача 3 и 4
     * @param message
     * @return
     */
    public Party inputParty (String message) {
        Party party = new Party();
        party.setName(Keyboard.keyboardString(message));
        // Дополнение к задаче 4
        /*
         int i = Keyboard.keyboardInt("Введите кол-во дополнительных полей; ");
         String[] keys = new String[i];
         String[] values = new String[i];
        for (int index = 0; index < keys.length; index ++){
            keys[index] = Keyboard.keyboardString("Введите название дополнительного поля; ");
            values[index] = Keyboard.keyboardString("Введите значение дополнительного поля; ");
        }
        party.setKeys(keys);
        party.setValues(values);

        */
        // допоплнение к задаче 5
        boolean continueInput = true;
        do {
            String keys = Keyboard.keyboardString("Введите название дополнительного поля; ");
            String values = Keyboard.keyboardString("Введите значение дополнительного поля; ");
            party.getProperties().put(keys, values);

            continueInput = continueInputQuestion(" Вы будете продолжать вводить дополнительные поля ");
        }while (continueInput);

        return party;
    }

    /**
     * Выводим значение полей объекта парти
     * @param party
     */
    public void outputParty (Party party){
        //К задаче 4
        System.out.println("Имя партнера " + party.getName());
        System.out.println("Адрес партнера " + party.getAddress());
        //К задаче 4
        /*
        for(int index = 0; index < party.getKeys().length; index++){
            System.out.println("Название дополнительного поля " + party.getKeys()[index]);
            System.out.println("Значение дополнительного поля " + party.getValues()[index]);
        }
        */
        //к задаче 5
        for(Map.Entry<String, String> entry:party.getProperties().entrySet()){
            System.out.println(" Название дополнительного поля " + entry.getKey() + " Значение дополнительного поля " + entry.getValue() );
        }

    }


    /**
     * Запрос у пользователя информации по заполнение Объекта Products
     * @return
     */

    public Product inputProduct (){
        /** Задача 3
        Product product = new Product();
        product.setTitle(Keyboard.keyboardString("Введите названия товара; "));
        product.setPrice(Keyboard.keyboardLong("Введите ценну товара: "));
        product.setQuntiti(Keyboard.keyboardInt("Введите кол-во товара: "));
        return product;
         */
        // Здача 4
        Product product = null;
        String rez = Keyboard.keyboardString("Выбрать продукт из ранее введеных (да или нет) ");
        if(rez.compareToIgnoreCase("да") == 0){
            product = selectProduct();
        }
        if(product != null){
            return product;
        }
        String s = Keyboard.keyboardString("Выберете продукт который Вы планируете вводить: Ботинки или Фотоаппорат; ");
        //product.setTitle("Введите названия товара;  ");
        //product.setPrice(Long.valueOf("Введите ценну товара: "));
        // до 5 заданиея
       // product.setQuntiti(Integer.valueOf("Введите кол-во товара: "));

        if(s.compareToIgnoreCase("Ботинки") == 0){
            BotinkiProduct botinkiProduct = new BotinkiProduct();
            botinkiProduct.setTitle(Keyboard.keyboardString("Введите названия товара;  "));
            botinkiProduct.setPrice(Long.valueOf(Keyboard.keyboardString("Введите ценну товара: ")));
            botinkiProduct.setSize(Integer.valueOf(Keyboard.keyboardString("Введите размер обуви: ")));
            botinkiProduct.setColor(Keyboard.keyboardString("Введите цвет обуви: "));

            product = botinkiProduct;
        } else if(s.compareToIgnoreCase("Фотоаппорат") == 0){
            FotoProduct fotoProduct = new FotoProduct();
            fotoProduct.setTitle(Keyboard.keyboardString("Введите названия товара;  "));
            fotoProduct.setPrice(Long.valueOf(Keyboard.keyboardString("Введите ценну товара: ")));
            fotoProduct.setMegapx(Double.valueOf(Keyboard.keyboardString("Введите ко-во Megapx: ")));
            String booleans = new String(Keyboard.keyboardString("Фотоаппорат цифровой (да или нет) "));
            boolean b = false;
                if (booleans.compareToIgnoreCase("да") == 0){
                    b = true;
                } else if(booleans.compareToIgnoreCase("нет") == 0){
                    b = false;
                } else {
                    System.err.print("Ошибка проверьте фотоапорат");
                    System.exit(-1);
                }
            fotoProduct.setDigetal(b);

            product = fotoProduct;
        } else {
            System.err.println("Введен не известный продукт");
            System.exit(-1);
        }
        // добавление продукта в кэш
        this.products.add(product);
        return product;
    }

    //до 5 задачи

    /**
     * Метод по вывводу полей объекта Product находящихся в массиве
     * @param products
     */
    /*
    public void outputProduct(Product[] products) {
        for(int index = 0; index < products.length; index++){
            if (null != products[index]) {
                System.out.println();
                if(products[index]instanceof BotinkiProduct){
                    BotinkiProduct botinkiProduct = (BotinkiProduct) products[index];
                    System.out.println("Цвет обуви" + botinkiProduct.getColor());
                    System.out.println("Размер обуви " + botinkiProduct.getSize());
                }else if(products[index] instanceof FotoProduct){
                    FotoProduct fotoProduct = (FotoProduct) products[index];
                    System.out.println("Кол-во мегапиксель равно "+ fotoProduct.getMegapx());
                    // Поле Digetal хранит boolean для вывода на экран городим огород
                    if (fotoProduct.isDigetal()){System.out.println("Фотоапорат цифровой");
                    }else {System.out.println("Фотоапорат не цифровой");}
                }else {
                    System.err.print("Проверить метод void outputProduct(Product[] products) всели продукты там введины");
                    System.exit(-1);
                }
                System.out.print("Товар сделки; " + products[index].getTitle());
                System.out.print(" Ценна " + products[index].getPrice());
                //до 5 задания
               // System.out.println(" Кол-во " + products[index].getQuntiti());
            }
        }

    }
    */

    /**
     * Метод для выбора продукта из ранее введеных
     * @return
     */
    private Product selectProduct (){
        if(products.isEmpty()){
            System.out.println(" Нет сохраненых продуктов. Требуется ввод ");
            return null;
        }
        for (int index = 0; index < products.size(); index++){
            System.out.println(" " + (index + 1) + " " + products.get(index).getTitle());
        }
        Integer rez = Keyboard.keyboardInt(" Введите номер необходимого продукта ");
        if (rez <= products.size()){
           return products.get(rez - 1);
        } else {
            System.out.println(" Введен НЕВЕРНЫЙ индекс продукта ");
            return null;
        }
    }

}
