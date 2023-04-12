package shoppingcart;

/**
 *
 * @author [Shashank Mondrati]
 * @version [10/14/2020]
 *
 */
public class ItemToPurchase { // class name

    private String itemName;
    private int itemPrice; // private fields
    private int itemQuantity;

    public ItemToPurchase() { // items to purchase fields
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    public ItemToPurchase(String itemName, int itemPrice, int itemQuantity) { // constructor
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public void setName(String itemName) { // setName
        this.itemName = itemName;
    }

    public String getName() { //getName
        return itemName;
    }

    public void setPrice(int itemPrice) { // setPrice
        this.itemPrice = itemPrice;
    }

    public int getPrice() { // getPrice
        return itemPrice;
    }

    public void setQuantity(int itemQuantity) { // setting Quantity
        this.itemQuantity = itemQuantity;
    }

    public int getQuantity() { // getting quantity
        return itemQuantity;
    }

}
