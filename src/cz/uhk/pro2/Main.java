package cz.uhk.pro2;

import cz.uhk.pro2.modules.PizzaMenu;
import cz.uhk.pro2.modules.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");

        PizzaMenu menu=new PizzaMenu();
        menu.addItem(new PizzaMenuItem(100, "Good taste", "Margarita"));
        menu.addItem(new PizzaMenuItem(120,"Not so good", "Mushroom special"));




        PizzaMenu menu2=new PizzaMenu();
        menu2.addItem(new PizzaMenuItem(100, "Good taste", "Margarita"));
        menu2.addItem(new PizzaMenuItem(120,"Not so good", "Mushroom special"));

        int number1 = 10;
        int number2 = 10;

        if(number1 == number2){
            System.out.println("number1 == number2");
        }

        if(menu.equals(menu2)){
            System.out.println("menu.equals(menu2)");
        }

        PizzaMenu menu3 = menu;
        menu3.addItem(new PizzaMenuItem(150, "Hawai", "Pineaple"));

        if(menu == menu3){
            System.out.println("menu == menu3");
        }


        for(PizzaMenuItem pizzaItem: menu.getItems()){
            System.out.println(pizzaItem);
        }
        System.out.println("last update:" + menu.getLastUpdate());
        System.out.println("end");
    }
}
