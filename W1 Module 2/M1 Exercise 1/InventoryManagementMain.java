public class InventoryManagementMain {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        Product p1 = new Product("S19823", "Headpones", 45, 1099.65);
        Product p2 = new Product("S14729", "TWS", 45, 1899.72);
        Product p3 = new Product("S29457", "Home Theatre", 90, 20899.99);

        inventory.addNewProduct(p1);
        inventory.addNewProduct(p2);
        inventory.addNewProduct(p3);

        inventory.updateExistingProduct("S19823", new Product("S26823", "Digital Watch", 900, 3299.08));

        inventory.removeProduct("S29457");

        Product p = inventory.obtainProduct("S14729");
        System.out.println("Product procured from inventory: " + p);
    }
}
