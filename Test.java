import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static  void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Items
        Item water = new Item("Water", "Drink for hidratation", 2.50, 6);

        //Employees
        Employee developer = new Employee ("Carlos", "Martinez", 15, "Developer", false);
    
        //Clients
        Client Juan = new Client("Juan", "Perez", "123456789", 4.0);


        //Order by Juan
        List<Item> buyWater = new ArrayList<>();
        water.setQuantity(10);
        buyWater.add(water);

        Order orderJuan = new Order(Juan, buyWater);

        if (orderJuan.canClientBuyItem()) {
            orderJuan.processPurchase();
            System.out.println("Compra exitosa! Saldo restante: $" + Juan.getMoneyOnHand()());
        } else {
            System.out.println("Saldo insuficiente para completar la compra");
        }

        
}

}