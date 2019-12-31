package cooperation;

public class GotoWork {
    public static void main(String[] args) {
        Person kim = new Person("kim",10000);
        Person lee = new Person("lee",10000);
        Person park = new Person("park",10000);
        Person ha = new Person("ha",10000);
        Person jung = new Person("jung",10000);

        Cafe cafe1 = new Cafe("bean");
        Cafe cafe2 = new Cafe("coffee");

        kim.buyCoffee(cafe1,Menu.americano);
        lee.buyCoffee(cafe1, Menu.americano);
        jung.buyCoffee(cafe2, Menu.americano);
        ha.buyCoffee(cafe1, Menu.java);
        park.buyCoffee(cafe2,Menu.latte);

        cafe1.cafeInfo();
        cafe2.cafeInfo();

    }
}
