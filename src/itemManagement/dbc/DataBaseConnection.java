package itemManagement.dbc;

import itemManagement.model.Item;

import java.util.ArrayList;

public class DataBaseConnection {
    public ArrayList<Item> itemArrayList;
    public static DataBaseConnection dbc;

    private DataBaseConnection() {
        itemArrayList = new ArrayList<>();
    }

    public static DataBaseConnection getInstance() {
        if (dbc == null) {
            dbc = new DataBaseConnection();
        }
        return dbc;
    }

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }

    @Override
    public String toString() {
        String str="";
          for (Item i:itemArrayList){
              str+=i.toString();
          }
          return  str;
    }
}
