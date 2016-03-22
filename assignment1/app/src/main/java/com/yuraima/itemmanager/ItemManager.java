package com.yuraima.itemmanager;

/**
 * Created by Yurm on 3/21/16.
 */
public class ItemManager {

    private String[] items;

    /* Constructor for ItemManager */
    public ItemManager(String[] initialitems) {
        items = initialitems;
    }

    public String[] getItems() {
        return items;
    }

    /* TODO EVERYTHING BELOW HERE IS WISHFUL THINKING FOR THE FUTURE */

    public void setItems(String[] newItems) {
        items = newItems;
    }

    /* Adds a new item to the manager items array*/
    public void addItem(String newItem) {

    }

    /* TODO add in a removal option for app */
    public void removeItem() {

    }

    /* Get the number of items currentl available */
    public int getNumItems() {
        return items.length;
    }
}
