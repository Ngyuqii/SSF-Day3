package SSF.HttpSession.models;

import java.util.List;
import java.util.LinkedList;

public class Cart {

    private List<Item> contents = new LinkedList<Item>();
    
    //Getter and Setter
    public List<Item> getContents() {
        return contents;
    }
    public void setContents(List<Item> contents) {
        this.contents = contents;
    }

    //Method to add item to cart contents
    public void addItemToCart(Item item){
        contents.add(item);
    }

}
