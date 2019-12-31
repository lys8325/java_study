package creditcard;

public class Company {
    private static Company instance = new Company();
    private Company(){ }

    public static Company getInstance(){
        return instance;
    }

    public Card createCard(){
        Card c = new Card();
        return c;
    }
}
