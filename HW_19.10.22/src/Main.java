public class Main {
    public static void main(String[] args) {
        /*
       Допустим, у нас есть магазин. В нашем магазине есть товары трёх категорий: продукты, электроника(мобильные телефоны и ноутбуки), одежда. У каждого товара есть цена и наименование .
       Каждый товар можно купить (покупателю выставляется счет).

       1.при покупки продуктов выставляется дополнительная цена за срочность доставки.
       2.при покупке электроники, покупателю оформляют гарантию (т.е. при покупке должен выполнятся метод “Оформить гарантию”)
       3.телефоны продаются только с контрактом оператора (т.е. при покупке должен выполнятся метод “Оформить контракт”)

       Необходимо создать соответствующую структуру классов метод покупки товара
         */


        Goods[] goods = {
                new Electronic(" Samsung", 780, 150),
                new Outfit("Shirt", 85),
                new Mobile("Iphone", 900, 135, 10),
                new Notebooks("Samsung",1200,300),
                new Products("Banana",2,5)
        };

        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i]);
        }

        System.out.println("-------------------------------------------------------------");


        Goods goods1 = new Mobile("Samsung",500,15,35);
        Goods goods2 = new Outfit("Shirt",55);
        Goods goods3 = new Notebooks("Lenovo",1250,10);
        Goods goods4 = new Products("Banana",3,5);
        

        System.out.println(goods1);
        System.out.println(goods2);
        System.out.println(goods3);
        System.out.println(goods4);









    }

}
