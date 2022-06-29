package sig.model;

import java.util.ArrayList;

public class InvoiceHeader {
    
    private int num;
    private String date;
    private String customer;
    private ArrayList<InvoiceItem> items;

    public InvoiceHeader(int num, String date, String customer) {
        this.num = num;
        this.date = date;
        this.customer = customer;
        this.items=new ArrayList<>();
    }

    public InvoiceHeader() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<InvoiceItem> items) {
        this.items = items;
    }

    
}
