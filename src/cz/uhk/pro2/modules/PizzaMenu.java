package cz.uhk.pro2.modules;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaMenuItem> items;
    private LocalDateTime lastUpdate;

    public PizzaMenu(){
        items=new ArrayList<>();
    }
    public void addItem(PizzaMenuItem item){
        items.add(item);
        lastUpdate = LocalDateTime.now();
    }
    public void removeItem(PizzaMenuItem item){
        items.remove(item);
    }
    public void removeItem(String name){
        PizzaMenuItem toDelete = null;
        for (PizzaMenuItem item:
             items) {
            if(item.getName().equals(name)){
                toDelete = item;
                continue;
            }
        }

        if(toDelete!=null)
            items.remove(toDelete);
    }

    public int menuCount(){
        return items.size();
    }
    public List<PizzaMenuItem> getItems(){
        return items;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object obj) {
        return ((PizzaMenu) obj).menuCount() == menuCount();
    }
}
