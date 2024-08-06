public class PlatformSearch {
    public Product linearSearch(Product[] products, String productId) {
        for (Product product : products) {
            if (product.obtainProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public Product binarySearch(Product[] products, String productId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (products[middle].obtainProductId().equals(productId)) {
                return products[middle];
            } else if (products[middle].obtainProductId().compareTo(productId) < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return null;
    }
}
