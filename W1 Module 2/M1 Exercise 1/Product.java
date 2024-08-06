public class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String obtainProductId() {
        return productId;
    }

    public String obtainProductName() {
        return productName;
    }

    public int obtainProductQuantity() {
        return quantity;
    }

    public double obtainProductPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID='" + productId + '\'' + "Product Name='" + productName + '\'' + ", Product Quantity="
                + quantity + ", Product Price=" + price;
    }
}