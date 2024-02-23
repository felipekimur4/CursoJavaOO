import java.io.OutputStream;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:" +
                "%s, which price is $ %f %n" +
                "%s, which price is $ %f %n" +
                "Record: %d years old, code %d, and gender %s %n " +
                "Measue with eight decimal places: %.8f %n" +
                "Rouded: %.3f%n", product1, price1, product2, price2, age, code, gender, measure, measure);

       Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.2f ", measure);
    }
}