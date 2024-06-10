package practice2;

public class MarketMain {
    public static void main(String[] args) {
        Human customer1 = new Human("John");
        Human customer2 = new Human("Anna");
        Human customer3 = new Human("Jack");
        Human customer4 = new Human("Alex");
        Human customer5 = new Human("Kate");

        Market market = new Market();

        market.acceptToMarket(customer1);
        market.acceptToMarket(customer2);
        market.acceptToMarket(customer3);
        market.acceptToMarket(customer4);
        market.acceptToMarket(customer5);

        customer1.setMakeOrder(true);
        customer2.setMakeOrder(true);

        System.out.println(market);
        System.out.println();
        market.update();
        System.out.println(market);
        System.out.println();

        Human customer6 = new Human("Irina");
        Human customer7 = new Human("Andy");

        market.acceptToMarket(customer6);
        market.acceptToMarket(customer7);

        customer4.setMakeOrder(true);
        customer7.setMakeOrder(true);

        System.out.println(market);
        System.out.println();
        market.update();
        System.out.println(market);
    }
}
