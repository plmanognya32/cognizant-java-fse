public class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String obtainProductId() {
        return productId;
    }

    public String obtainProductName() {
        return productName;
    }

    public String obtainProductCategory() {
        return category;
    }

    @Override
    public String toString(){
        return "Product ID='" + productId + '\'' + "Product Name='" + productName + '\'' + ", Product Category="
                + category;
    }
}