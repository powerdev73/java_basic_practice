package powerdev.devstudy.polymorphismex;

public class GoldCustomer extends Customer{
    double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }
}
