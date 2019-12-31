package cooperation;

public class Person {
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Person(String name, int money){
        setName(name);
        setMoney(money);
    }

    public void buyCoffee(Cafe store,int price){
        int money,num;
        String menu;
        money = getMoney() - price;
        setMoney(money);

        num = store.getNumP() + 1;
        store.setNumP(num);

        store.setProfit(store.getProfit() + price);

        if(price == Menu.americano){
            menu = "아메리카노";
        }
        else if(price == Menu.latte){
            menu = "카페라떼";
        }
        else if(price == Menu.java){
            menu = "자바칩프라푸치노";
        }
        else {
            menu = null;
        }

        System.out.println(getName() + "님이 "+ store.getName()+"에서 "+ menu + "를 사고 " + price + "원 낸 후 남은돈은 "+ getMoney()+ "원입니다.");
    }
}
