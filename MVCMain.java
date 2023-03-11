import java.util.Scanner;

public class MVCMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //input pen details
        // creating a view to write Employee details on console
        Pen pen = new Pen();
        PenView view = new PenView();
        PenController controller = new PenController(pen, view);
        input(controller);//input arraylist
        output(controller);//output
    }

    private static void input(PenController controller) {
        int n = 0;
        System.out.println("Enter input n(No of pen details) to be entered:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        controller.inputPens(n);
    }
    private static void output(PenController controller) {
        System.out.println("Printing all details");
        controller.viewPenDetails(controller.getPens());
        System.out.println();
        System.out.println("Enter brand name for printing pens based on brand:");
        String brandName = sc.next();
        System.out.println("Printing all details by brand " + brandName);
        controller.viewPenDetailsByBrand(controller.getPens(),brandName);
        System.out.println("Enter price for printing all pens whose price >=price:");
        float price = sc.nextFloat();
        System.out.println("Printing all details >= " + price);
        controller.viewPenDetailsByPrice(controller.getPens(),price);
    }
}
