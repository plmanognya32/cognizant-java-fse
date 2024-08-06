import java.util.HashMap;

public class InventoryManagement {
    private HashMap<String, Product> products;

    public InventoryManagement() {
        this.products = new HashMap<>();
    }

    public void addNewProduct(Product product) {
        products.put(product.obtainProductId(), product);
        System.out.println("New product added:\n" + product);
    }

    public void updateExistingProduct(String productId, Product productUpdated) {
        if (products.containsKey(productId)) {
            products.put(productId, productUpdated);
            System.out.println("Existing product updated:\n" + productUpdated);
        } else {
            System.out.println(productId + ": Not found in existing products");
        }
    }

    public void removeProduct(String productId) {
        Product productRemove = products.remove(productId);
        if (productRemove != null) {
            System.out.println("Existing product deleted:\n" + productRemove);
        } else {
            System.out.println(productId + ": Not found in existing products");
        }
    }

    public Product obtainProduct(String productId) {
        return products.get(productId);
    }
}
