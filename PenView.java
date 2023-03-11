import java.util.ArrayList;
import java.util.Objects;

public class PenView {
    //list of pens
    public void viewPenDetails(ArrayList<Pen> pens) {
        for (int i = 0; i < pens.size(); i++) {
                viewDetails(pens.get(i));
        }
    }
    public void viewDetails(Pen pen){
        System.out.println("Item No: " + pen.getItemId());
        System.out.println("Brand Name: " + pen.getBrandName());
        System.out.println("Color: " + pen.getColor());
        System.out.println("Stock Available: " + pen.getStockAvailable());
        System.out.println("Price: " + pen.getPrice());
    }
    public void viewPenDetailsByBrand(ArrayList<Pen> pens,String brandName) {
        int cnt = 0;
        for (int i = 0; i < pens.size(); i++) {
            if(Objects.equals(pens.get(i).getBrandName(), brandName)) {
                cnt++;
                viewDetails(pens.get(i));
            }
        }
        if(cnt == 0) System.out.println("No details of this condition matches!!");
    }
    public void viewPenDetailsByPrice(ArrayList<Pen> pens,float price) {
        int cnt =0;
        for (int i = 0; i < pens.size(); i++) {
            if(pens.get(i).getPrice() >= price){
                cnt++;
                viewDetails(pens.get(i));
            }
        }
        if(cnt == 0) System.out.println("No details of this condition matches!!");
    }
}
