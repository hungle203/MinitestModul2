package Bai;

public class QuanLiSp {
    private double id;
    private String name;
    private double price;
    private String type;
    private int quantity;
    private double money;

    public QuanLiSp() {

    }
    public QuanLiSp(double id, String name, double price, String type, double money){
        this.id =id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.money = money;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double sumPrice(){
        return money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", moneyUnit='" + money + '\'' +
                '}';
    }
}
