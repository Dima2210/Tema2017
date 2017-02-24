package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

/**
 * Условие задачи смотри клас Main
 * Класс для создание сделки и выввода её на экран
 * Created by User on 01.02.2017.
 */
public class Program {
    // регулируем кол-во сделок
    private static final int DEAL = 1;
    //регулируем кол-во продуктов
    private static final int PRODUCT = 2;
    // Как тут дела где массив используется????? (создается )
    private Deal[] deal = new Deal[DEAL];
    private int tail = 0;

    /**
     * Метод для заполнения массива сделки     *
     */
    public  void input () {
        for (int index = 0; index < deal.length; index++){
            this.deal[index] = inputDeal();
        }

        if (tail < 10) {
            this.deal[tail] = inputDeal();
            tail++;
        } else {
            System.out.println("Сделку ввести не возможна память исчерпана");
        }
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
        // Создаем три товара
        System.out.println("Введите три товара сделки:");
        Product [] products = new Product[PRODUCT];
        for (int index = 0; index < products.length; index++){
            products[index] = inputProduct();
        }
        // Создаем сделку
        return new Deal(buyer, seller, products);
    }
    /**
     * Вывод массива сделок на экран
     */
    public void outputProgramDeal() {
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
         int i = Keyboard.keyboardInt("Введите кол-во дополнительных полей; ");
         String[] keys = new String[i];
         String[] values = new String[i];
        for (int index = 0; index < keys.length; index ++){
            keys[index] = Keyboard.keyboardString("Введите название дополнительного поля; ");
            values[index] = Keyboard.keyboardString("Введите значение дополнительного поля; ");
        }
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
        for(int index = 0; index < party.getKeys().length; index++){
            System.out.println("Название дополнительного поля " + party.getKeys()[index]);
            System.out.println("Значение дополнительного поля " + party.getValues()[index]);
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
        String s = Keyboard.keyboardString("Выберете продукт который Вы планируете вводить Ботинки; 2 Фотоаппорат; ");
        product.setTitle("Введите названия товара;  ");
        product.setPrice(Long.valueOf("Введите ценну товара: "));
        product.setQuntiti(Integer.valueOf("Введите кол-во товара: "));
        if("Ботинки" == s){
            BotinkiProduct botinkiProduct = new BotinkiProduct();
            botinkiProduct.setSize(Integer.valueOf(Keyboard.keyboardString("Введите размер обуви: ")));
            botinkiProduct.setColor(Keyboard.keyboardString("Введите цвет обуви: "));

            product = botinkiProduct;
        } else if("Фотоапорат" == s){
            FotoProduct fotoProduct = new FotoProduct();
            fotoProduct.setMegapx(Double.valueOf(Keyboard.keyboardString("Введите ко-во Megapx: ")));
            String booleans = new String(Keyboard.keyboardString("Фотоапорат цифровой (да или нет)"));
            boolean b = false;
                if ("да" == booleans){
                    b = true;
                } else if("нет" == booleans){
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
        return product;
    }

    /**
     * Метод по вывводу полей объекта Product находящихся в массиве
     * @param products
     */
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
                System.out.println(" Кол-во " + products[index].getQuntiti());
            }
        }

    }

}
