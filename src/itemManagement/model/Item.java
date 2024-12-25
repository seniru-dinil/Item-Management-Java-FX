package itemManagement.model;

public class Item {
    private String itemCode;
    private String itemName;
    private String itemDescription;
    private int itemQTY;
    private double itemPrice;

    public Item(String itemCode, String itemDescription, String itemName, double itemPrice, int itemQTY) {
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQTY = itemQTY;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQTY() {
        return itemQTY;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemQTY(int itemQTY) {
        this.itemQTY = itemQTY;
    }


    public Item ifExist(String o) {
        return o.equals(this.itemCode)?this:null;
    }

    @Override
    public String toString() {
        return itemCode+","+itemName+","+itemDescription+","+itemQTY+","+itemPrice+"\n";
    }
}
