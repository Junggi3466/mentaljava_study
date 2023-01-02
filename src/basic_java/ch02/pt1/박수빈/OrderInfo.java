package ch02;

public class OrderInfo {

    public String orderNumber;
    public String phoneNum;
    public String address;
    public String orderDate;
    public String orderTime;
    public int orderPrice;
    public String menuNum;

    public OrderInfo(){}

    public OrderInfo(String orderNumber, String phoneNum, String address, String orderDate,
                     String orderTime, int orderPrice, String menuNum) {
        this.orderNumber = orderNumber;
        this.phoneNum = phoneNum;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNum = menuNum;
    }

    public String showOrderInfo() {
        return "배달 주문이 들어왔습니다. new" + "\n" +
                "주문 접수 번호 : " + orderNumber + "\n" +
                "주문 핸드폰 번호 : " + phoneNum + "\n" +
                "주문 집 주소 : " + address + "\n" +
                "주문 날짜 : " + orderDate + "\n" +
                "주문 시간 : " + orderTime + "\n" +
                "주문 가격 : " + orderPrice + "\n" +
                "메뉴 번호 : " + menuNum;
    }
}
