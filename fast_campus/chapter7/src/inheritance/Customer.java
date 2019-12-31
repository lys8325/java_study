package inheritance;

public class Customer {
    private static int ID=10010;
    private int cid;
    private String name;
    private String grade;
    private double bonusratio;
    private int bonus;

    public Customer (String name, String grade){
        int num = ID;
        setCid(num);
        ID += 10;
        setName(name);
        setGrade(grade);
        setBonus(5000);
        setBonusratio(0.03);
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getBonusratio() {
        return bonusratio;
    }

    public void setBonusratio(double bonusratio) {
        this.bonusratio = bonusratio;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void buy(){
        int total = getBonus() + (int)(15000 * getBonusratio());
        setBonus(total);
        System.out.println(getName() + "님이 15000원 제품을 구매시");
        System.out.println(getGrade() + "등급의 혜택을 받아 " + (int)(15000 * getBonusratio()) + "원 적립되어 총 "+getBonus()+"원입니다.");
        System.out.println("가격은 15000원 입니다.");
    }

    public void showInfo(){
        System.out.println("=== "+getCid()+" : "+getName()+" 님의 고객 정보 ===");
        System.out.println("등급 정보 : "+getGrade());
        System.out.println("적립된 보너스 포인트 : "+getBonus());
        System.out.println("할인율 : 0");
        System.out.println("적립률 : "+getBonusratio());
    }
}
