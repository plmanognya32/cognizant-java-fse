public class SortingCustomersMain {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("S75839", "Shreeya", 8439.27),
            new Order("S26485", "Shree", 374303.47),
            new Order("S03846", "Meghan", 4653.56),
            new Order("S47492", "Meena", 2749.57)
        };

        SortingCustomers sorting = new SortingCustomers();

        // Bubble Sort
        sorting.bubbleSort(orders);
        System.out.println("Orders sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        sorting.quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }

}
