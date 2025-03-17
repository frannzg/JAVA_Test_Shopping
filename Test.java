import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static  void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Items
        Item water = new Item("Water", "Drink for hidratation", 2.50, 6);

        //Clients
        Client Juan = new Client("Juan", "Perez", "123456789", 50.0);

        //Works
        Work developer = new Work("Software Development", 3000.0);

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