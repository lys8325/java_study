package creditcard;

public class CardCompanyTest {
    public static void main(String[] args) {
        Company visa = Company.getInstance();

        Card lee = visa.createCard();
        Card park = visa.createCard();

        System.out.println(lee.getSN());
        System.out.println(park.getSN());
    }
}
