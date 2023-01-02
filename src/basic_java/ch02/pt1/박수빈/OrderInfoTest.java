package ch02;

public class OrderInfoTest {
    public static void main(String[] args) {

        OrderInfo orderN = new OrderInfo();
        orderN.orderNumber = "202011020003";
        orderN.phoneNum = "01023450001";
        orderN.address = "서울시 강남구 역삼동 111-333";
        orderN.orderDate = "20201102";
        orderN.orderTime = "130258";
        orderN.orderPrice = 35000;
        orderN.menuNum = "0003";

        String data = orderN.showOrderInfo();
        System.out.println(data);
    }
}
