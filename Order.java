import java.util.List;

public class Order {
    private Client client;
    private List<Item> items;
    private double totalAmount;

    public Order(Client client, List<Item> items){
        this.client = client;
        this.items = items;
        this.totalAmount = calculateTotalAmount();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
        this.totalAmount = calculateTotalAmount();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    //Functions:

    public boolean processPurchase() {
        if (canClientBuyItem()) {
            client.setMoneyOnHand(client.getMoneyOnHand() - totalAmount);
            return true;
        }
        return false;
    }

    public boolean canClientBuyItem() {
        return client.getMoneyOnHand() >= totalAmount;
    }

    private double calculateTotalAmount() {
        double total = 0;
        for (Item item : items) {
            double price = item.getPrice();
            int quantity = item.getQuantity();
            double itemTotal = price * quantity;
            total += itemTotal; 
        }
        return total;
    }

      // Override toString method
       @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Order for ").append(client.getName()).append(":\n");
        for (Item item : items) {
            orderDetails.append("- ").append(item.getName())
                        .append(": $").append(item.getPrice())
                        .append(" x ").append(item.getQuantity()).append("\n");
        }
        orderDetails.append("Total Amount: $").append(totalAmount);
        return orderDetails.toString();
    }


}
