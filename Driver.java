public class Driver {
    public static void main(String[] args) {
        NYPizzaStore TonysPizza = new NYPizzaStore();
        TonysPizza.orderPizza("cheese");

        ImosPizza Imos = new ImosPizza();
        Imos.orderPizza("cheese");
        Imos.orderPizza("chicken");
    }
}
