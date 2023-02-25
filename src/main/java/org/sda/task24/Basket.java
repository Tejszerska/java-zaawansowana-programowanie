package org.sda.task24;

public class Basket {
    private int itemsNumber;
    private final int itemsAllowed = 10;

    public Basket(int itemsNumber) {
        this.itemsNumber = itemsNumber;
    }

    public Basket() {
        this.itemsNumber = 0;
    }

    public int getItemsAllowed() {
        return itemsAllowed;
    }

    public int getItemsNumber() {
        return itemsNumber;
    }

    public void setItemsNumber(int itemsNumber) throws  BasketFullException{
        if(itemsNumber < 0 ) throw new BasketEmptyException("Can't set numbers of items to less than 0!");
        else if (itemsNumber>itemsAllowed) throw new BasketFullException("Can't add more than " + itemsAllowed + " elements");
        this.itemsNumber = itemsNumber;
    }

    public void addToBasket() throws  BasketFullException{
        if(itemsNumber == itemsAllowed) throw new BasketFullException("Basket is full. Adding new items is impossible");
        itemsNumber += 1;
    }

    public void removeFromBasket() {
        if(itemsNumber == 0) throw new BasketEmptyException("Basket is empty. Removing items is impossible");
        itemsNumber -= 1;
    }

}
