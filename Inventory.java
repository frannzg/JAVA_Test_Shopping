import java.util.*;

public class Inventory {
    private Map<String, Item> items;
    private double totalValue;

    public Inventory(){
        this.items = new HashMap<>();
        this.totalValue = 0.0;
    }
    
    public void addItem(Item item) {
        String itemName = item.getName();
        if (items.containsKey(itemName)) {
            // If item already exists, update quantity
            Item existingItem = items.get(itemName);
            existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
        } else {
            // Add new item
            items.put(itemName, item);
        }
        updateTotalValue();
    }
    
    public void removeItem(String itemName, int quantity) {
        if (items.containsKey(itemName)) {
            Item item = items.get(itemName);
            int currentQuantity = item.getQuantity();
            
            if (currentQuantity <= quantity) {
                // Remove item completely
                items.remove(itemName);
            } else {
                // Reduce quantity
                item.setQuantity(currentQuantity - quantity);
            }
            updateTotalValue();
        }
    }
    
    public Item getItem(String itemName) {
        return items.get(itemName);
    }
    
    public boolean hasStock(String itemName, int quantity) {
        if (items.containsKey(itemName)) {
            return items.get(itemName).getQuantity() >= quantity;
        }
        return false;
    }
    
    public List<Item> getAllItems() {
        return new ArrayList<>(items.values());
    }
    
    public void listInventory() {
        System.out.println("===== INVENTORY =====");
        for (Item item : items.values()) {
            System.out.println(item.getName() + " - " + 
                              "Price: $" + item.getPrice() + ", " +
                              "Quantity: " + item.getQuantity());
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }
    
    private void updateTotalValue() {
        totalValue = 0.0;
        for (Item item : items.values()) {
            totalValue += item.getPrice() * item.getQuantity();
        }
    }
    
    public double getTotalValue() {
        return totalValue;
    }
    
    public int getItemCount() {
        return items.size();
    }
    
    public int getTotalQuantity() {
        int total = 0;
        for (Item item : items.values()) {
            total += item.getQuantity();
        }
        return total;
    }

    
}
