package MyRepository.Tema2017.Tema2.YuriyTkach.Tema3;

/**
 * Условие задачи смотри клас Main
 * Класс для создание сделки и выввода её на экран
 * Created by User on 01.02.2017.
 */
public class Program {

    private Deal[] deal = new Deal[10];
    private int tail = 0;

    /**
     * Метод для заполнения массива сделки     *
     */
    public  void input () {
        if (tail < 10) {
            this.deal[tail] = inputDeal();
            tail++;
        } else {
            System.out.println("Сделку ввести не возможна память исчерпана");
        }
    }

    /**
     * Метод по созданию сделки
      */
    public Deal inputDeal (){
        // Имя покупателя вводится с клавиатуры
        Party buyer= inputParty("Введите покупателя: ");
        // Имя продавца вводится с клавиатуры
        System.out.println("*********");
        Party seller = inputParty("Введите продовца: ");
        System.out.println("=============");

        // Создаем три товара
        System.out.println("Введите три товара сделки:");
        Product [] products = new Product[3];
        for (int index = 0; index < products.length; index++){
            products[index] = inputProduct();
        }
        // Создаем сделку
        return new Deal(buyer, seller, products);

    }

    /**
     * Создаем объект Party через ввод с клавиатуры
     * @param message
     * @return
     */
    public Party inputParty (String message) {
        Party party = new Party();
        party.setName(Keyboard.keyboardString(message));
        return party;
    }

    /**
     * Запрос у пользователя информации по заполнение Объекта Products
     * @return
     */
    public Product inputProduct (){
        Product product = new Product();
        product.setTitle(Keyboard.keyboardString("Введите названия товара; "));
        product.setPrice(Keyboard.keyboardLong("Введите ценну товара: "));
        product.setQuntiti(Keyboard.keyboardInt("Введите ко-во товара: "));
        return product;
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
     * Метод по вывводу полей объекта Product находящихся в массиве
     * @param products
     */
    public void outputProduct(Product[] products) {
        for(int index = 0; index < products.length; index++){
            if (null != products[index]) {
                System.out.print("Товар сделки; " + products[index].getTitle());
                System.out.print(" Ценна " + products[index].getPrice());
                System.out.println(" Кол-во " + products[index].getQuntiti());
            }
        }

    }



}
