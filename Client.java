public class Client {
    private String name;
    private String email;
    private String phone;
    private double moneyOnHand;

    public Client(String name, String email, String phoneNumber, double moneyOnHand) {
        this.name = name;
        this.email = email;
        this.phone = phoneNumber;
        this.moneyOnHand = moneyOnHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoneyOnHand() {
        return moneyOnHand;
    }

    public void setMoneyOnHand(double moneyOnHand) {
        this.moneyOnHand = moneyOnHand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", moneyOnHand=").append(moneyOnHand);
        sb.append('}');
        return sb.toString();
    }
  
}