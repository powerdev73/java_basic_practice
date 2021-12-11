package powerdev.devstudy.inheritanceex;

public class VIPCustomer extends Customer{
    private String agentID;        //  담당자 아이디
    double saleRatio;   //  할인률

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= price * saleRatio;
        return price;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
