package classpart;

public class Shopping {
    String orderNum;
    String orderID;
    String orderDate;
    String orderName;
    String pNum;
    String address;

    public void getShoppingInfo(){
        System.out.println("주문 번호 : " +  orderNum);
        System.out.println("주문자 아이디 : " +  orderID);
        System.out.println("주문 날짜 : " +  orderDate);
        System.out.println("주문자 이름 : " +  orderName);
        System.out.println("주문 상품 번호 : " +  pNum);
        System.out.println("배송 주소 : " +  address);
    }
}
