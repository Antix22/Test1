import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product mleko = new Product("Mlekowita",3, "nabiał",20,23);
        mleko.setName("Łaciate");
//        mleko.price = 4.99;
//        mleko.amount = 100;
//        mleko.category = "nabiał";

        System.out.println(mleko);
        System.out.println(mleko.getName());
        System.out.println(mleko.getPrice());

        Product Cukier = new Product();

        System.out.println(Cukier.getName());
        System.out.println(Cukier.getPrice());

        System.out.println(mleko.countPriceVAT());
        System.out.println(mleko.countvalueProduct());
        System.out.printf("cena Brutto %s wynosi %.2f",
                mleko.getName(), mleko.countPriceVAT());

        System.out.printf("%.2f", mleko.countvalueProduct());


    }

}