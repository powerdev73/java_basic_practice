package powerdev.devstudy.inheritanceex;

public class Customer {
    protected int customerID;         //  고객 아이디
    protected String customerName;    //  고객 이름
    protected String customerGrade;   //  고객 등급
    int bonusPoint;                 //  보너스 포인트
    double bonusRatio;              //  보너스 적립 비율

    public Customer(){
        customerGrade = "SILVER";   //  기본 고객 등급은 SILVER
        bonusRatio = 0.01;          //  기본 보너스 적립율은 1%
    }

    public int calcPrice(int price){
        // 상품 가격에 대한 보너스 포인트를 적립하고 가격을 다시 반환
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        // 고객의 정보를 출력
        return customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
