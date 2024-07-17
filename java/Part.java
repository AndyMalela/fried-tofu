public class Part {
    private String partName;
    private String partNumber;
    private int quantity;
    private String condition;
    private Supplier supplier;
    private Order order;

    public String getPartDetails() {
        return String.format("Part Name: %s, Part Number: %s, Quantity: %d, Condition: %s",
                partName, partNumber, quantity, condition);
    }

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void linkToOrder(Order order) {
        this.order = order;
    }

    // Getters and setters
}
