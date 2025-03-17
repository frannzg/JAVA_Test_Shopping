import java.util.ArrayList;
import java.util.List;

public class Test {
    public static  void main(String[] args) {

        //Items
        Item water = new Item("Water", "Drink for hidratation", 2.50, 6);

        //Clients
        Client Juan = new Client("Juan", "Perez", "123456789", 50.0);

        //Works
        Work developer = new Work("Software Development", 3000.0);
        Work developer1 = new Work("Software Development", 7000.0);
        Work developer2 = new Work("Software Development", 5000.0);


        Work[] works = {developer, developer1, developer2};

       for (Work work : works){
        System.out.println("Position: " +
         work.getName() + ", Salary: $" + 
         work.getSalary());
       }

       Inventory storeInventory = new Inventory();
       // Add items to inventory
       storeInventory.addItem(new Item("Laptop", "High-end laptop", 999.99, 5));
       storeInventory.addItem(new Item("Mouse", "Wireless mouse", 29.99, 20));






        //Employees
        Employee developerSoftware = new Employee ("Carlos", "Martinez", 15, "Developer", false, developer);

        System.err.println("Bienvenido a la empresa informatico: ");
        System.out.println(developerSoftware);
        System.out.println("");
        
        System.out.println("¿ Bienvenido Juan a la tienda, que desea ?");
        //Order by Juan
        List<Item> buyWater = new ArrayList<>();
        water.setQuantity(10);
        buyWater.add(water);

        Order orderJuan = new Order(Juan, buyWater);

        String compra = orderJuan.getItems().toString();
        System.out.println("Tu orden de compra es: " + compra);

        System.out.println("Valor total del pedido: $" + orderJuan.getTotalAmount());

        if (orderJuan.canClientBuyItem()) {
            orderJuan.processPurchase();
            System.out.println("Compra exitosa! Saldo restante: $" + Juan.getMoneyOnHand());
        } else {
            System.out.println("Saldo insuficiente para completar la compra");
        } 
}

}