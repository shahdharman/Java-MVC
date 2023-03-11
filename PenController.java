import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PenController {
    private Pen pen;
    private PenView penView;
    Scanner sc = new Scanner(System.in);
    //controller
    public void PenController(Pen pen,PenView penView){
        this.pen = pen;
        this.penView = penView;
    }
    public PenController(Pen pen, PenView penView) {
        this.pen = pen;
        this.penView = penView;
    }
    public void setItemId(String itemId){
        pen.setItemId(itemId);
    }
    public void setBrandName(String brandName){
        pen.setBrand(brandName);
    }
    public void setPrice(float price){
        pen.setPrice(price);
    }
    public void setColor(String color){
        pen.setColor(color);
    }

    public void setStockAvailable(int stockAvailable){
        pen.setStockAvailable(stockAvailable);
    }
    public void setPens(ArrayList<Pen> pens){
         pen.setPens(pens);
    }
    //getter methods
    public String getItemId(){
        return pen.getItemId();
    }
    public String getBrandName(){
        return pen.getBrandName();
    }
    public float getPrice(){
        return pen.getPrice();
    }
    public String getColor(){
        return pen.getColor();
    }

    public int getStockAvailable(){
        return pen.getStockAvailable();
    }

    //view methods.

    public void applyDiscount(float price){
            pen.applyDiscount(price);
    }

    public ArrayList<Pen> getPens(){
        return pen.getPens();
    }
    //public void inputPens(int n){
      //  pen.inputPens(n);
//    }
    public void viewPenDetails(ArrayList<Pen> pens){

        penView.viewPenDetails(pens);
    }
    public void viewPenDetailsByBrand(ArrayList<Pen> pens,String brandName){
        penView.viewPenDetailsByBrand(pens,brandName);
    }
    public void viewPenDetailsByPrice(ArrayList<Pen> pens,float price){
        penView.viewPenDetailsByPrice(pens,price);

    }
    void inputPens(int n){
        ArrayList<Pen> pens;
        pens = new ArrayList<Pen>(n);
        for(int i=1;i<=n;i++){
            Pen pen = new Pen();
            System.out.println("Enter Id:");
            pen.setItemId(sc.next());
            System.out.println("Enter brand name:");
            pen.setBrand(sc.next());
            System.out.println("Enter color:");
            pen.setColor(sc.next());
            System.out.println("Enter stock available:");
            pen.setStockAvailable(sc.nextInt());
            System.out.println("Enter price:");
            pen.setPrice(sc.nextFloat());
            pens.add(pen);
        }
        pen.setPens(pens);
    }

}
