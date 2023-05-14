public class NYPizzaStore extends PizzaStore
{
    public Pizza makePizza(String type){
        if(type.equals("cheese")){
            Pizza pizza = new NYCheesePizza();
            return pizza;
        }
        else if(type.equals("veggie")){
            Pizza pizza = new NYVeggiePizza();
            return pizza;
        }
        else{
            return null;
        }
    }
}