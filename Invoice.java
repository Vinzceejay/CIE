public class Invoice {
    private String number;
    private String descript;
    private int quantity;
    private double price;
    private double Amount;

    public Invoice(String number, String descript, int quantity, double price) {
        this.number = number;
        this.descript = descript;
        this.quantity = quantity;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount() {
        double Amount = quantity * price;
        return Amount;
    }
}
