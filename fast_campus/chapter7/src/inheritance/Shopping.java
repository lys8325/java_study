package inheritance;
import java.util.ArrayList;

public class Shopping {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<Customer>();
        Customer lee = new VIPCustomer("Lee","VIP");
        Customer park = new VIPCustomer("Park","VIP");
        Customer shin = new GoldCustomer("Shin","Gold");
        Customer kim = new GoldCustomer("Kim","Gold");
        Customer won = new Customer("Won", "Silver");

        list.add(lee);
        list.add(park);
        list.add(shin);
        list.add(kim);
        list.add(won);

        for(Customer c : list){
            c.showInfo();
        }

        for(Customer c : list){
            if(c instanceof VIPCustomer){
                VIPCustomer v = (VIPCustomer)c;
                v.buy2();
            }
            else if(c instanceof GoldCustomer){
                GoldCustomer g = (GoldCustomer)c;
                g.buy3();
            }
            else{
                c.buy1();
            }
        }
    }
}
