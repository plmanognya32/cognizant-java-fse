import java.util.Arrays;

public class PlatformSearchMain {

    public static void main(String[] args) {
        Product[] products = {
                new Product("S24795", "Treadmill", "Electronics"),
                new Product("S47294", "Refrigerator", "Electronics"),
                new Product("S47592", "Tablet", "Electronics"),
                new Product("S27490", "Headphones", "Accessories")
        };

        PlatformSearch search = new PlatformSearch();

        Product productFind = search.linearSearch(products, "S47294");
        System.out.println("Search using Linear Search: Found " + productFind);

        Arrays.sort(products, (p1, p2) -> p1.obtainProductId().compareTo(p2.obtainProductId()));
        productFind = search.binarySearch(products, "S47592");
        System.out.println("Search using Binary Search: Found " + productFind);
    }

}
