public class Order {
    private String orderId;
    private String customerName;
    private double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String obtainOrderId() { 
        return orderId;
    }
    public String obtainCustomerName() {
        return customerName;
    }
    public double obtainTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order Id='" + orderId + '\'' +
                ", Customer Name='" + customerName + '\'' +
                ", Total Price=" + totalPrice;
    }
}
