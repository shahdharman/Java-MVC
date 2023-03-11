import java.util.ArrayList;
import java.util.Scanner;
//model -> data
//controller
//view
public class Pen {
    private ArrayList<Pen> pens;
    private String itemId;
    private String brandName;
    private String color;
    private int stockAvailable;
    private float price;
    Scanner sc = new Scanner(System.in);
    //setter methods
    void setItemId(String itemId){
        this.itemId = itemId;
    }
    void setBrand(String brandName){
        this.brandName = brandName;
    }
    void setColor(String color){
        this.color = color;
    }
    void setStockAvailable(int stockAvailable){
        this.stockAvailable = stockAvailable;
    }
    void setPrice(float price){
        this.price = price;
    }
    //getter methods
    String getItemId(){
        return itemId;
    }
    String getBrandName(){
        return brandName;
    }
    String getColor(){
        return color;
    }
    int getStockAvailable(){
        return stockAvailable;
    }
    float getPrice(){
        return price;
    }
    //provide arraylist
    public void applyDiscount(float price){
        //applying 10% off if crosses threshold price.
        if(this.price >= price) this.price = (0.90f) * this.price;
    }
    ArrayList<Pen> getPens(){
         return pens;
    }

    public void setPens(ArrayList<Pen> pens) {
        this.pens = pens;
    }
}
