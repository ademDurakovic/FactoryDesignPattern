public class ImosPizza extends PizzaStore {
    public Pizza makePizza(String type){
        if(type.equals("cheese")){
            Pizza pizza = new ThinCrustCheese();
            return pizza;
        }
        else if(type.equals("chicken")){
            Pizza pizza = new ImosChicken();
            return pizza;
        }
        else{
            return null;
        }
    }
    
}
