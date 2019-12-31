package classpart;

public class ShoppingList {
    public static void main(String[] args) {
        Shopping list1 = new Shopping();
        list1.orderNum = "20191228";
        list1.orderID = "lys8325";
        list1.orderDate = "2019년 12월 28일";
        list1.orderName = "이혁수";
        list1.pNum = "ph1 - 12qw1";
        list1.address = "인천광역시 부평구";

        list1.getShoppingInfo();
    }
}
