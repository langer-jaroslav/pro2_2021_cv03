package cz.uhk.pro2.modules;

public class PizzaMenuItem {
    private int price;
    private String description;
    private String name;

    public PizzaMenuItem(){}
    public PizzaMenuItem(int price, String description, String name){
        this.price=price;
        this.description=description;
        this.name=name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + name+" - "+description + " - "+price+" Kč";
    }
}
