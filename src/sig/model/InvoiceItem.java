package sig.model;

public class InvoiceItem {
    
    private String itemName;
    private double itemPrice;
    private int count;

    public InvoiceItem( String itemName, double itemPrice, int count) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

  
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String CustomerName) {
        this.itemName = CustomerName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    
}
