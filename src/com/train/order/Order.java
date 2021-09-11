package com.train.order;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Order {
    public static void main(String[] args){
        HashMap<String, Item> menuItem = new HashMap<String, Item>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/yayarhisao/Desktop/menu.txt"));
            String menuItemString = bufferedReader.readLine();
            while (menuItemString != null){
                Item item = new Item(menuItemString.split(",")[0], menuItemString.split(",")[1], menuItemString.split(",")[2], menuItemString.split(",")[3]);
                menuItem.put(item.getId(), item);
                menuItemString = bufferedReader.readLine();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        printMenu(menuItem);
    }

    public static void printMenu(HashMap<String, Item> map){
        for (Object key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
