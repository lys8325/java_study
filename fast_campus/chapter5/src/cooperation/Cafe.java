package cooperation;

public class Cafe {
    private String name;
    private int profit;
    private int numP;

    public Cafe(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getNumP() {
        return numP;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    public void cafeInfo(){
        System.out.println(getName()+"의 오늘 하루 총 수입은 : " + getProfit() +"원 이며 총 "+getNumP() + "명이 다녀갔습니다.");
    }
}
