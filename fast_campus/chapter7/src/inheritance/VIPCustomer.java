package inheritance;

public class VIPCustomer extends Customer{
    private static int agentID = 501;
    private double salesratio;
    private int agentNum;

    public VIPCustomer(String name, String grade){
        super(name,grade);
        int num = agentID;
        ++agentID;
        setBonus(15000);
        setSalesratio(0.1);
        setAgentNum(num);
        setBonusratio(0.1);
    }

    public double getSalesratio() {
        return salesratio;
    }

    public void setSalesratio(double salesratio) {
        this.salesratio = salesratio;
    }

    public int getAgentNum() {
        return agentNum;
    }

    public void setAgentNum(int agentNum) {
        this.agentNum = agentNum;
    }

    public void buy2(){
        int total = getBonus() + (int)(15000 * getBonusratio());
        setBonus(total);
        System.out.println(getName() + "님이 15000원 제품을 구매시");
        System.out.println(getGrade() + "등급의 혜택을 받아 " + (int) (15000 * getBonusratio()) + "원 적립되어 총 " + getBonus() + "원입니다.");
        System.out.println("가격은 "+(int)(getSalesratio()*100)+"% 할인을 받아 " + (15000-(int)(15000*getSalesratio()))+"원 입니다.");
    }

    public void showInfo(){
        System.out.println("=== "+getCid()+" : "+getName()+" 님의 고객 정보 ===");
        System.out.println("등급 정보 : "+getGrade());
        System.out.println("적립된 보너스 포인트 : "+getBonus());
        System.out.println("할인율 : "+getSalesratio());
        System.out.println("적립률 : "+getBonusratio());
        System.out.println("담당 직원 번호 : "+getAgentNum());
    }
}
